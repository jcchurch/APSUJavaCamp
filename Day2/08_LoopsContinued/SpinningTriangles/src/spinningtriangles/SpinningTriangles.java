/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinningtriangles;

import java.util.Random;
import javafx.scene.paint.Color;
import turtles.Sandbox;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class SpinningTriangles extends Sandbox {

    @Override
    public void draw() {
        Random rng = new Random();
        Turtle turtle = new Turtle();
        add(turtle);
        
        Color[] colors = {Color.RED, Color.ORANGE,  Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET };
        
        for (int i = 0; i < 1000; i++) {
            turtle.setColor(colors[i % 7]);
            int size = rng.nextInt(100) + 50;
            int degrees = rng.nextInt(360) - 180;
            turtle.forward(size);
            turtle.left(degrees);
        }
        
        /*
        for (int i = 0; i < 72; i++) {
            turtle.up();
            turtle.forward(size / 2);
            turtle.down();
            turtle.setColor(colors[i % 7]);
            turtle.left(150);
            
            for (int s = 0; s < 3; s++) {   
                turtle.forward(size);
                turtle.left(120);
            }
            
            turtle.left(30);
            turtle.up();
            turtle.forward(size / 2);
            turtle.down();
            turtle.left(185);
        }*/
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
