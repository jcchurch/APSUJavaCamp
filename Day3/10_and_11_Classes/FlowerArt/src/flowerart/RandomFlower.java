/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerart;

import java.util.Random;
import javafx.scene.paint.Color;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class RandomFlower extends Flower{

    public void draw() {
        Random rng = new Random();
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
        
        double size = rng.nextDouble() * 100 + 50;
        int petals = rng.nextInt(5) + 8;
        double radius = rng.nextDouble() * 75 + 15;
        Color color = colors[ rng.nextInt(7) ];
        
        double x = rng.nextInt(600);
        double y = rng.nextInt(600);
        
        Turtle turtle = get();
        
        turtle.up();
        turtle.goTo(x, y);
        turtle.down();
        draw(color, petals, radius, size);
    }
}
