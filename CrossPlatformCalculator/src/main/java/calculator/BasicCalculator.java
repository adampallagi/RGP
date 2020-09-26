package calculator;


import module.HistoryModule;
import module.IModule;
import providers.Calculation;
import providers.IBasicMathFunctionality;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class BasicCalculator implements ICalculator<Double> {

    private Calculation storedCalculation;
    private IBasicMathFunctionality bm;
    private HashMap<String, IModule> modules;
    private HashMap<String, Method> functions;

    public BasicCalculator(IBasicMathFunctionality bm) {
        modules = new HashMap<>();
        functions = new HashMap<>();
        this.bm = bm;

        for (Method m : bm.getClass().getMethods()) {
            functions.put(m.getName(), m);
        }

        registerModule("history", new HistoryModule());

    }


    @Override
    public Double evaluate(Calculation calculation) {
        if (storedCalculation == null) {
            storedCalculation = calculation;
            Method m = getMathMethod(storedCalculation);
            if (m == null)
                return storedCalculation.getCurrentValue();
            try {
                if (m.getParameterCount() == 1) {
                    storedCalculation.setCurrentOperator(calculation.getCurrentOperator());
                    storedCalculation.setCurrentValue((Double) m.invoke(bm, storedCalculation.getCurrentValue()));
                    return storedCalculation.getCurrentValue();
                }
                else
                    return storedCalculation.getCurrentValue();
            } catch (InvocationTargetException | IllegalAccessException iae) {
                System.out.println(iae.getMessage());
            }
        }
        Method method = getMathMethod(calculation);
        if (method == null)
            return storedCalculation.getCurrentValue();
        try {
            if (method.getParameterCount() == 1)
                storedCalculation.setCurrentValue((Double) method.invoke(bm, storedCalculation.getCurrentValue()));
            else
                storedCalculation.setCurrentValue((Double) method.invoke(bm, storedCalculation.getCurrentValue(), calculation.getCurrentValue()));

        } catch (InvocationTargetException | IllegalAccessException iae) {
            System.out.println(iae.getMessage());
        }

        storedCalculation.setCurrentOperator(calculation.getCurrentOperator());
        return storedCalculation.getCurrentValue();

    }

    private Method getMathMethod(Calculation calculation) {
        Method method = null;

        if (calculation.getCurrentOperator().equals("=")) {
            if (storedCalculation.getCurrentOperator().equals("="))
                storedCalculation.setCurrentValue(calculation.getCurrentValue());
            else
                method = functions.get(storedCalculation.getCurrentOperator());
        } else if (storedCalculation.getCurrentOperator().equals("=")) {
            method = functions.get(calculation.getCurrentOperator());
        } else {
            Method newMethod = functions.get(calculation.getCurrentOperator());
            if(newMethod.getParameterCount() == 1)
                method = newMethod;
            else
                method = functions.get(storedCalculation.getCurrentOperator());
        }


        return method;
    }

    public void registerModule(String moduleName, IModule m) {

        modules.put(moduleName, m);

    }

    public <T extends IModule> T getModule(String moduleName) {
        if (modules.containsKey(moduleName))
            return (T) modules.get(moduleName);
        else
            return null;
    }

    public void clearCalculations() {
        storedCalculation = null;
    }

    public void updateOperator(String operator){
        storedCalculation.setCurrentOperator(operator);
    }
}