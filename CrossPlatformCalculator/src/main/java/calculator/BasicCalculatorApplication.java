package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BasicCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(BasicCalculatorApplication.class.getResource("/fxml/basicCalculator.fxml"));
        stage.setTitle("Basic Calculator");
        stage.setScene(new Scene(parent));
        stage.show();
    }
}
