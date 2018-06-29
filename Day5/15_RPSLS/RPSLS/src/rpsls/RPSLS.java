/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jcchurch
 */
public class RPSLS extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public String getName(int x) {
        if (x == 0) {
            return "rock";
        }
        if (x == 1) {
            return "paper";
        }
        if (x == 2) {
            return "scissors";
        }
        if (x == 3) {
            return "lizard";
        }
        return "Spock";
    }

    public void displayResults(int player, int cpu, Label game) {
        int[][] gameMatrix = {
            {0, -1, 1, 1, -1}, // Rock
            {1, 0, -1, -1, 1}, // Paper
            {-1, 1, 0, 1, -1}, // Scissors
            {-1, 1, -1, 0, 1}, // Lizard
            {1, -1, 1, -1, 0} // Spock
        };

        String playerName = getName(player);
        String cpuName = getName(cpu);

        if (gameMatrix[player][cpu] == -1) {
            game.setText("You picked " + playerName + ". The CPU beat you with " + cpuName);
        }

        if (gameMatrix[player][cpu] == 0) {
            game.setText("The CPU and You picked " + playerName + ". Tie game!");
        }

        if (gameMatrix[player][cpu] == 1) {
            game.setText("You win! The CPU picked " + cpuName + ".");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Random rng = new Random();

        Label game = new Label("Let's play a game.");

        Button rock = new Button("Rock");
        Button paper = new Button("Paper");
        Button scissors = new Button("Scissors");
        Button lizard = new Button("Lizard");
        Button spock = new Button("Spock");

        HBox buttons = new HBox();
        buttons.getChildren().addAll(rock, paper, scissors, lizard, spock);

        VBox vPane = new VBox();
        vPane.getChildren().addAll(game, buttons);

        Scene scene = new Scene(vPane);
        primaryStage.setScene(scene);
        primaryStage.show();

        rock.setOnMouseClicked(event -> {
            int x = rng.nextInt(5);
            displayResults(0, x, game);
        });

        paper.setOnMouseClicked(event -> {
            int x = rng.nextInt(5);
            displayResults(1, x, game);
        });

        scissors.setOnMouseClicked(event -> {
            int x = rng.nextInt(5);
            displayResults(2, x, game);
        });

        lizard.setOnMouseClicked(event -> {
            int x = rng.nextInt(5);
            displayResults(3, x, game);
        });

        spock.setOnMouseClicked(event -> {
            int x = rng.nextInt(5);
            displayResults(4, x, game);
        });
    }

}
