/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretmessages;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jcchurch
 */
public class SecretMessages extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public String encrypt(String original) {
        String encrypted = "";
        
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            if (Character.isUpperCase(ch)) {
                int x = (int)(ch - 'A');
                
                if (x >= 13)
                    x -= 13;
                else
                    x += 13;
                
                encrypted += (char) (x + 'A');
            }
            else
                encrypted += ch;
        }
        
        return encrypted;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextArea input = new TextArea();
        TextArea output = new TextArea();
        Button button = new Button("Encrypt!");
        
        VBox vPane = new VBox();
        vPane.getChildren().addAll(input, button, output);
        
        Scene scene = new Scene(vPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        button.setOnAction(event -> {
              String original = input.getText().toUpperCase();
              output.setText(encrypt(original));
           });
    }
}
