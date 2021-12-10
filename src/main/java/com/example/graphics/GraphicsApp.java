package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GraphicsApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // BorderPane root = new BorderPane();
            // root.setCenter(createInputPane());
            GridPane root = new GridPane();
            Label widthLabel = new Label("Width");
            Label heightLabel = new Label("Height");
            Label circumferenceLabel = new Label("Circumference");
            Label areaLabel= new Label("Area");
            TextField widthTextField = new TextField();
            TextField heightTextField = new TextField();
            Label resultCircumferenceTextField = new Label();
            Label resultAreaTextField = new Label();
            Button computeButton = new Button("Compute");

            root.add(widthLabel, 0, 0);
            root.add(widthTextField, 1, 0);
            root.add(heightLabel, 0, 1);
            root.add(heightTextField, 1, 1);
            root.add(computeButton, 1, 2);
            root.add(circumferenceLabel, 0, 3);
            root.add(resultCircumferenceTextField, 1, 3);
            root.add(areaLabel, 0, 4);
            root.add(resultAreaTextField, 1, 4);
            root.setVgap(10);
            root.setHgap(10);


            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Graphics App");
            primaryStage.show();

            computeButton.setOnAction(e-> {
                double width = Double.valueOf(widthTextField.getText());
                double height = Double.valueOf(heightTextField.getText());
                resultCircumferenceTextField.setText(String.valueOf(computeCircumference()));
            });

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
