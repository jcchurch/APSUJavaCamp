/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spirals;

import java.util.Random;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;
import turtles.Sandbox;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class Spirals extends Sandbox {

    @Override
    public void draw() {
        Random rng = new Random();
        Turtle turtle = new Turtle();
        add(turtle);

        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};

        for (int t = 0; t < 72; t++) {
            turtle.setColor(colors[t % 7]);
            for (int i = 0; i < 100; i++) {
                turtle.forward(i);
                turtle.left(10);
            }
            
            turtle.up();
            turtle.goHome();
            turtle.down();
            turtle.left(5);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
