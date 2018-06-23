package square;

import turtles.Sandbox;
import turtles.Turtle;

public class Square extends Sandbox {

    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);

        turtle.forward(100);
        turtle.left();
        turtle.forward(100);
        turtle.left();
        turtle.forward(100);
        turtle.left();
        turtle.forward(100);
        turtle.left();
    }

    public static void main(String[] args) {
        launch(args);
    }
}