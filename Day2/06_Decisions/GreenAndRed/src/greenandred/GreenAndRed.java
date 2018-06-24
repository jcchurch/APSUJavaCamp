/*
James Church
CSCI 2070
Jun 24, 2018

PROJECT DESCRIPTION HERE
 */
package greenandred;

import java.util.Scanner;
import javafx.scene.paint.Color;
import turtles.Sandbox;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class GreenAndRed extends Sandbox {

    @Override
    public void draw() {
        Scanner keyboard = new Scanner(System.in);
        Turtle turtle = new Turtle();
        add(turtle);
        
        System.out.println("Enter size of square: ");
        int size = keyboard.nextInt();

        if (size > 50) {
            turtle.setColor(Color.GREEN);
        }
        
        if (size > 100) {
            turtle.setColor(Color.RED);
        }

        turtle.forward(size);
        turtle.left(90);
        turtle.forward(size);
        turtle.left(90);
        turtle.forward(size);
        turtle.left(90);
        turtle.forward(size);
        turtle.left(90);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
