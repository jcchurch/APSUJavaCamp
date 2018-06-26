/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaretrianglecircle;

import turtles.Sandbox;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class SquareTriangleCircle extends Sandbox {

    @Override
    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);
        
        turtle.up();
        turtle.backward(100);
        turtle.down();

        drawCircle(turtle, 3);
        moveToNextShape(turtle);
        drawCircle(turtle, 6);
        moveToNextShape(turtle);
        drawCircle(turtle, 4);
    }

    private void moveToNextShape(Turtle turtle) {
        turtle.up();
        turtle.forward(150);
        turtle.down();
    }

    private void drawCircle(Turtle turtle, double size) {
        for (int i = 0; i < 100; i++) {
            turtle.forward(size);
            turtle.left(3.6);
        }
    }

    private void drawTriangle(Turtle turtle) {
        for (int i = 0; i < 3; i++) {
            turtle.forward(100);
            turtle.left(120);
        }
    }

    private void drawSquare(Turtle turtle) {
        turtle.forward(100);
        turtle.left(90);
        turtle.forward(100);
        turtle.left(90);
        turtle.forward(100);
        turtle.left(90);
        turtle.forward(100);
        turtle.left(90);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
