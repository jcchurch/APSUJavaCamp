/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalk;

import java.util.Random;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;
import turtles.Sandbox;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class RandomWalk extends Sandbox {

    @Override
    public void draw() {
        Random rng = new Random();
        Turtle turtle = new Turtle();
        add(turtle);

        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};

        for (int i = 0; i < 1000; i++) {
            turtle.setColor(colors[i % 7]);
            int size = rng.nextInt(100) + 50;
            int degrees = rng.nextInt(360) - 180;
            turtle.forward(size);
            turtle.left(degrees);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
