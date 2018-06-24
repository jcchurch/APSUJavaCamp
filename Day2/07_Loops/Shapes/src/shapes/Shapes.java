/*
James Church
CSCI 2070
Jun 24, 2018

PROJECT DESCRIPTION HERE
 */
package shapes;

import java.util.Scanner;
import static javafx.application.Application.launch;
import turtles.Sandbox;
import turtles.Turtle;

/**
 *
 * @author jcchurch
 */
public class Shapes extends Sandbox {
    
    @Override
    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter sides of the shape: ");
        int sides = keyboard.nextInt();

        double sumOfDegrees = (sides - 2) * 180.0;
        double internalDegrees = sumOfDegrees / sides;
        double degrees = 180 - internalDegrees;
        double distance = 500.0 / sides;

        for (int i = 0; i < sides; i++) {
            turtle.forward(distance);
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
