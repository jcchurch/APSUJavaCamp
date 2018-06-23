package square;

import javafx.scene.paint.Color;
import turtles.Sandbox;
import turtles.Turtle;


public class Square extends Sandbox {

    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);
        
        Turtle george = new Turtle();
        add(george);

        turtle.setColor(Color.GREEN);
        turtle.forward(100);
        turtle.left();
        turtle.setColor(Color.YELLOW);
        turtle.forward(100);
        turtle.left();
        turtle.setColor(Color.RED);
        turtle.forward(100);
        turtle.left();
        turtle.setColor(Color.PALEGOLDENROD);
        turtle.forward(100);
        turtle.left();
    }

    public static void main(String[] args) {
        launch(args);
    }
}