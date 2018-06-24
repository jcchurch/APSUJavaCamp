package square;

import javafx.scene.paint.Color;
import turtles.Sandbox;
import turtles.Turtle;

public class Square extends Sandbox {

    @Override
    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);

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

        turtle.up();
        turtle.forward(150);
        turtle.down();

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
