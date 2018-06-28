/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jcchurch
 */
public class Hangman extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label gameState = new Label("");
        Label playHangman = new Label("Play Hangman! Guess a letter.");
        TextField field = new TextField();
        Button button = new Button("Go!");
        HangmanGame game = new HangmanGame(300, 300);

        HBox hPane = new HBox();
        hPane.getChildren().addAll(playHangman, field, button);
        
        VBox vPane = new VBox();
        vPane.getChildren().addAll(game.getCanvas(), hPane, gameState);
        
        game.draw();

        primaryStage.setScene(new Scene(vPane));
        primaryStage.show();
        
        button.setOnAction(event -> {
              char guess = field.getText().toUpperCase().charAt(0);
              field.setText("");
              game.scratch(guess);
              game.draw();
              
              if (game.won()) {
                  gameState.setText("You win!");
              }
              
              if (game.lost()) {
                  gameState.setText("You lost!");
              }
           });
    }
}
