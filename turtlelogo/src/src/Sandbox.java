/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author churchj
 */
public class Sandbox extends Application {
    
    protected Canvas sandbox;
    public ArrayList<Turtle> turtles;
    
    public Sandbox(int width, int height) {
        this.setup(width, height);
    }

    public Sandbox() {
        this.setup(600, 600);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox box = new VBox();
        box.getChildren().add(this.sandbox);
        this.draw();
        
        this.turtles.forEach((turtle) -> {
            turtle.drawArrow();
        });
        
        primaryStage.setScene(new Scene(box));
        primaryStage.show();
    }

    private void setup(int width, int height) {
        this.sandbox = new Canvas(width, height);
        this.turtles = new ArrayList<>();
    }
    
    public void add(Turtle turtle) {
        turtle.initialize(this.sandbox);
        this.turtles.add(turtle);
    }
    
    public void draw() {
    }
}
