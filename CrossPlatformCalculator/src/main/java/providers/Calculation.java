package providers;
import org.tinylog.Logger;
public class Calculation {
    private Double currentValue;

    private String currentOperator;

    public Double getCurrentValue() {
        Logger.info("Current valuse has been sent");
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        Logger.info("Current valuse has been set");
        this.currentValue = currentValue;
    }

    public String getCurrentOperator() {
        Logger.info("Current operator has been sent");
        return currentOperator;
    }

    public void setCurrentOperator(String currentOperator) {
        Logger.info("Current operator has been set");
        this.currentOperator = currentOperator;
    }

}
