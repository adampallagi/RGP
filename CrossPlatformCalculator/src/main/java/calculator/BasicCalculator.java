package calculator;


import module.HistoryModule;
import module.IModule;
import providers.Calculation;
import providers.IBasicMathFunctionality;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class BasicCalculator implements ICalculator<Double>{

    private Calculation storedCalculation;
    private IBasicMathFunctionality bm;
    private HashMap<String, IModule> modules;
    private HashMap<String, Method> functions;

    public BasicCalculator(IBasicMathFunctionality bm)
    {
        modules = new HashMap<>();
        functions = new HashMap<>();
        this.bm = bm;

        for(Method m : bm.getClass().getMethods())
        {
            functions.put(m.getName(), m);
        }

        registerModule("history",new HistoryModule());

    }


    @Override
    public Double evaluate(Calculation calculation) {
        /*
            1. Ha van mentett Calc akkor kiértékelés és frissítés
            2. Ha nincs, akkor elmenti.
            3. Visszatérés
         */
        if(storedCalculation == null)
        {
           storedCalculation = calculation;
           return storedCalculation.getCurrentValue();
        }

        Method function = null;

        if(calculation.getCurrentOperator().equals("="))
        {
            if(storedCalculation.getCurrentOperator().equals("="))
            {
                storedCalculation.setCurrentValue(calculation.getCurrentValue());
                return storedCalculation.getCurrentValue();
            }
            else
                function = functions.get(storedCalculation.getCurrentOperator());
        }
        else if(storedCalculation.getCurrentOperator().equals("="))
        {
            function = functions.get(calculation.getCurrentOperator());
        }
        else
            function = functions.get(storedCalculation.getCurrentOperator());


        try {
            if (function.getParameterCount() == 1)
                storedCalculation.setCurrentValue((Double) function.invoke(bm, storedCalculation.getCurrentValue()));
            else
                storedCalculation.setCurrentValue((Double) function.invoke(bm, storedCalculation.getCurrentValue(), calculation.getCurrentValue()));

        }
        catch(InvocationTargetException | IllegalAccessException iae) {
            System.out.println(iae.getMessage());
            Arrays.stream(iae.getStackTrace()).forEach(System.out::println);
        }

        storedCalculation.setCurrentOperator(calculation.getCurrentOperator());
        return storedCalculation.getCurrentValue();
    }

    public void registerModule(String moduleName, IModule m){

        modules.put(moduleName,m);

    }

    public <T extends IModule> T getModule(String moduleName)
    {
        if(modules.containsKey(moduleName))
            return (T)modules.get(moduleName);
        else
            return null;
    }
}