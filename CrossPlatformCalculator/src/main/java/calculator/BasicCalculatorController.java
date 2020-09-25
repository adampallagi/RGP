package calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import providers.Calculation;

import java.io.IOException;

public class BasicCalculatorController {

    private BasicCalculator basicCalculator;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

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


    @FXML
    public void handleClickOnOperator(ActionEvent event){

        Calculation calc = new Calculation();
        double value = Double.parseDouble(display.getText());
        calc.setCurrentValue(value);

        if (event.getSource() == addition) {
            calc.setCurrentOperator("add");
        } else if (event.getSource() == subtraction) {
            calc.setCurrentOperator("subtract");
        } else if (event.getSource() == multiplication) {
            calc.setCurrentOperator("multiply");
        } else if (event.getSource() == division) {
            calc.setCurrentOperator("divide");
        } else if (event.getSource() == percentage) {
            calc.setCurrentOperator("percentage");
        } else if (event.getSource() == sinus) {
            calc.setCurrentOperator("sin");
        } else if (event.getSource() == cosinus) {
            calc.setCurrentOperator("cos");
        } else if (event.getSource() == tangens) {
            calc.setCurrentOperator("tan");
        } else if (event.getSource() == cotangens) {
            calc.setCurrentOperator("ctg");
        } else if (event.getSource() == modulo) {
            calc.setCurrentOperator("mod");
        } else if (event.getSource() == xPowY) {
            calc.setCurrentOperator("power");
        } else if (event.getSource() == squareRoot) {
            calc.setCurrentOperator("sqrt");
        } else if (event.getSource() == factorial) {
            calc.setCurrentOperator("factorial");
        } else if (event.getSource() == greatestCommonDivisor) {
            calc.setCurrentOperator("gcd");
        } else if (event.getSource() == leastCommonMultiple) {
            calc.setCurrentOperator("lcm");
        } else if (event.getSource() == equal) {
            calc.setCurrentOperator("=");
        }

        display.setText(String.valueOf(basicCalculator.evaluate(calc)));
    }


    @FXML
    private void handleClickOnNumber(ActionEvent event) {

        if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == decimalDot) {
            display.setText(display.getText() + ".");
        }
    }


    @FXML
    private void handleClickOnClear(ActionEvent event) {
        if (event.getSource() == clear) {
            display.setText("");
        }
    }


    @FXML
    private void handleClickOnPlusMinusSign(ActionEvent event) {
        if (event.getSource() == plusMinus) {
            int displayText = Integer.parseInt(display.getText());
            displayText = displayText * (-1);
            display.setText(String.valueOf(displayText));
        }
    }


    @FXML
    private void handleClickOnMemory(ActionEvent event) {
        String memory_one = "";
        String memory_two = "";
        String memory_three = "";
        String memory_four = "";

        if (event.getSource() == memoryOne) {
            if (memory_one == "") {
                memory_one = display.getText();
            } else {
                display.setText(memory_one);
            }
        }
        if (event.getSource() == memoryTwo) {
            if (memory_two == "") {
                memory_two = display.getText();
            } else {
                display.setText(memory_two);
            }
        }
        if (event.getSource() == memoryThree) {
            if (memory_three == "") {
                memory_three = display.getText();
            } else {
                display.setText(memory_three);
            }
        }
        if (event.getSource() == memoryFour) {
            if (memory_four == "") {
                memory_four = display.getText();
            } else {
                display.setText(memory_four);
            }
        }
    }

    @FXML
    private void handleClickOnCloseMenuItem(ActionEvent event) {
        if (event.getSource() == closeMenuItem) {
            Platform.exit();
            System.exit(0);
        }
    }
}