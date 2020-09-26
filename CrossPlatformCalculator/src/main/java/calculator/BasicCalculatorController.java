package calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import providers.BasicMath;
import providers.Calculation;

import java.io.IOException;

public class BasicCalculatorController {

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button allClear;

    @FXML
    private Button addition;

    @FXML
    private Button subtraction;

    @FXML
    private Button multiplication;

    @FXML
    private Button division;

    @FXML
    private Button percentage;

    @FXML
    private Button sinus;

    @FXML
    private Button cosinus;

    @FXML
    private Button tangens;

    @FXML
    private Button cotangens;

    @FXML
    private Button modulo;

    @FXML
    private Button xPowY;

    @FXML
    private Button squareRoot;

    @FXML
    private Button greatestCommonDivisor;

    @FXML
    private Button leastCommonMultiple;

    @FXML
    private Button factorial;

    @FXML
    private Button equal;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button decimalDot;

    @FXML
    private Button plusMinus;

    @FXML
    private Button memoryOne;

    @FXML
    private Button memoryTwo;

    @FXML
    private Button memoryThree;

    @FXML
    private Button memoryFour;

    @FXML
    private MenuItem closeMenuItem;

    private BasicCalculator basicCalculator;
    private String memory_one = "";
    private String memory_two = "";
    private String memory_three = "";
    private String memory_four = "";

    private boolean isOperatorClicked = false;

    public BasicCalculatorController()
    {
        basicCalculator = new BasicCalculator(new BasicMath());
    }

    @FXML
    public void handleClickOnOperator(ActionEvent event) {
        Calculation calc = new Calculation();
        double value = Double.parseDouble(display.getText());
        calc.setCurrentValue(Double.valueOf(value));

        String operator = ((Button) event.getSource()).getText();
        switch (operator) {
            case "+":
                calc.setCurrentOperator("add");
                break;
            case "-":
                calc.setCurrentOperator("subtract");
                break;
            case "X":
                calc.setCurrentOperator("multiply");
                break;
            case "/":
                calc.setCurrentOperator("divide");
                break;
            case "%":
                calc.setCurrentOperator("mod");
                break;
            case "sin":
            case "cos":
            case "tan":
            case "ctg":
                isOperatorClicked = false;
                calc.setCurrentOperator(operator);
                break;
            case "x^y":
                calc.setCurrentOperator("power");
                break;
            case "sqrt(x)":
                isOperatorClicked = false;
                calc.setCurrentOperator("sqrt");
                break;
            case "x!":
                isOperatorClicked = false;
                calc.setCurrentOperator("factorial");
                break;
            case "gcd":
            case "lcm":
                calc.setCurrentOperator(operator);
                break;
            case "=":
                calc.setCurrentOperator("=");
                break;
            default:
                calc.setCurrentOperator("=");
                break;

        }

        if(!isOperatorClicked) {
            String result = String.valueOf(basicCalculator.evaluate(calc));
            display.setText(result);
        }
        else {
            basicCalculator.updateOperator(calc.getCurrentOperator());
            return;
        }
        isOperatorClicked = true;
    }


    @FXML
    private void handleClickOnNumber(ActionEvent event) {

        if(isOperatorClicked)
            display.setText("");
        isOperatorClicked = false;

        String digit = ((Button) event.getSource()).getText();
        if(digit.equals(".") && display.getText().contains("."))
            return;
        display.setText(display.getText().concat(digit));
    }


    @FXML
    private void handleClickOnClear() {
        display.setText("");
    }

    @FXML
    private void handleClickOnAllClear() {
        basicCalculator.clearCalculations();
        display.clear();
        memory_one = "";
        memory_two = "";
        memory_three = "";
        memory_three = "";
    }


    @FXML
    private void handleClickOnPlusMinusSign(ActionEvent event) {
        int displayText = Integer.parseInt(display.getText());
        displayText = displayText * (-1);
        display.setText(String.valueOf(displayText));
    }


    @FXML
    private void handleClickOnMemory(ActionEvent event) {

        if (event.getSource() == memoryOne) {
            if (memory_one.equals("")) {
                memory_one = display.getText();
            } else {
                display.setText(memory_one);
            }
        }
        if (event.getSource() == memoryTwo) {
            if (memory_one.equals("")) {
                memory_two = display.getText();
            } else {
                display.setText(memory_two);
            }
        }
        if (event.getSource() == memoryThree) {
            if (memory_one.equals("")) {
                memory_three = display.getText();
            } else {
                display.setText(memory_three);
            }
        }
        if (event.getSource() == memoryFour) {
            if (memory_one.equals("")) {
                memory_four = display.getText();
            } else {
                display.setText(memory_four);
            }
        }
    }

    @FXML
    private void handleClickOnCloseMenuItem(ActionEvent event) {
        Platform.exit();
        System.exit(0);

    }
}