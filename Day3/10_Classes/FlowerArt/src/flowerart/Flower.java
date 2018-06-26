/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerart;

import javafx.scene.paint.Color;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class Flower {

    private final Turtle turtle;
    
    public Flower() {
        turtle = new Turtle();
    }
    
    public Turtle get() {
        return turtle;
    }
    
    public void lines(int segments, double length, double angle){ 
        for (int i = 0; i < segments; i++) {
            turtle.forward(length);
            turtle.left(angle);
        }
    }
    
    public void polygon(int sides, double length) {
        double angle = 360 / sides;
        lines(sides, length, angle);
    }
    
    public void arc(double radius, double angle) {
        double arc_length = 2 * Math.PI * radius * Math.abs(angle) / 360.0;
        
        int segments = (int) (arc_length / 4) + 1;
        
        double step_length = arc_length / segments;
        double step_angle = angle / segments;
        
        turtle.left(step_angle / 2);
        lines(segments, step_length, step_angle);
        turtle.right(step_angle / 2);
    }
    
    public void petal(double radius, double angle) {
        arc(radius, angle);
        turtle.left(180-angle);
        arc(radius, angle);
        turtle.left(180-angle);
    }
    
    public void draw(Color color, double petals, double radius, double angle) {
        turtle.setColor(color);
        for (int i = 0; i < petals; i++) {
            petal(radius, angle);
            turtle.left(360.0 / petals);
        }
    }
}
