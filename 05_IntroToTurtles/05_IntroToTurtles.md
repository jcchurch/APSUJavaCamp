% 05: Turtles

## Turtles

- Today we will play with Turtles.
- Turtles are a visual approach to teaching programming.
- Turtles live in a sandbox.
- Turtles have a tail.
    - When the tail is down, it draws with its tail.
    - When the tail is up, it doesn't draw.
    - Turtles always start with their tail down.

## Getting Started

- Download the TurtleLogo.jar file from the GitHub course page.
- Save this file to your Desktop so that you can find it quickly.
- Create a new project in Netbeans named "TurtlePlay".
- Import the TurtleLogo.jar file.
    - Find the "Libraries" section of your project under "Projects".
    - Right click on "Libraries" and click "Add JAR/Folder..."
    - Find the TurtleLogo.jar file and open it.

## Start Programming.

Modify the line containing "public class TurtlePlay {" to look like this.

    public class TurtlePlay extends Sandbox

Our program is a sandbox in which we will add turtles. You will have to fix your code's imports to make the error on "Sandbox" go away.

## Start Programming.

In your main method, add one line of code. It will look like this.

    public static void main(String[] args) {
        launch(args);
    }

## Place a turtle 

Create a new method called "draw".

    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);
    }

The error on "Turtle" will require you to fix your imports again. Run your program. You should see an arrow on the screen. That arrow is the turtle.

## Make the turtle move.

Create a new method called "draw".

    public void draw() {
        Turtle turtle = new Turtle();
        add(turtle);

        turtle.forward(100);
    }

## Line Arrow

Run your program. You should see a line with an arrow on the screen.

![Line arrow](images/linearrow.png)

## Make the turtle turn and move.

Add more lines.

    turtle.left(90);
    turtle.forward(100);

## Line, Left, Line

Run your program. The turtle should have turned left and moved forward again. What do the values of 90 and 100 mean in this program?

![Line, left, line](images/lineleftline.png)

## 90 and 100

- The "turtle.left(90)" means that the turtle will turn to the left 90 degrees. A 90 degree turn is a right-angle turn.
- The "turtle.forward(100)" means that the turtle will move forward 100 units. In this case, a unit is equal to one pixel on the monitor.

## Send the turtle back home.

Finish this code so that the turtle returns to the starting location by making a square shape. You've already completed two sides of the square.

![Square](images/square.png)

## Here's my solution.

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

## Change the color.

You can change the color using the method `SetColor`. For example.

    turtle.setColor(Color.GREEN);
    turtle.forward(100);
    turtle.left();
    // ... more lines which draw

This will make the color of the square green.

## Rainbow Colors

- Any time you hit the ".", you can wait for a second an options will appear on the screen. When you type "Color." wait a bit to see all of the colors you can make.
- You can make common colors like "GREEN", "BLUE", and "RED", but you can make other colors like "WHEAT", "CADETBLUE", and "PALEGOLDENROD".
- Make each of the four lines in the square a different color.

![Rainbow Square](images/rainbowsquare.png)

## Make a new turtle.

Create a new turtle in your `draw` method. Name your turtle. I'm going to name mine "george". You can place your turtle in the code after the original `add(turtle)` line.

     Turtle turtle = new Turtle();
     add(turtle);

     Turtle george = new George();
     add(george);

We can now control our second turtle as an independent turtle.
