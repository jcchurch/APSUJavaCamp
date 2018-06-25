% 08: Fun with Loops

# The for Loop Recap

## The for Loop

Take a moment to remind yourself what a for-loop looks like.

    for (initialization; test; update) {
        statement(s);
    }

## Goal

- In this activity, our goal is to create a random turtle walk.
- We will need to understand arrays.

## Arrays

- An array is a list of variables.
- An array has $n$ items.
- The first element in an array is always zero.
- The last element in an array is always $n-1$.
- If an array has 7 elements, what is the position of the first and last element?

## Colors

What are the seven colors of the rainbow?

. . .

- Red, Orange, Yellow, Green, Blue, Indigo, and Violet.
- If this were an array, what is the position of Red?
- If this were an array, what is the position of Green?
- If this were an array, what is the position of Violet?

## Colors

What are the seven colors of the rainbow?

- Red, Orange, Yellow, Green, Blue, Indigo, and Violet.
- If this were an array, what is the position of Red? 0
- If this were an array, what is the position of Green? 3
- If this were an array, what is the position of Violet? 6

As computer scientists, we always begin counting with 0.

## Colors

- Imagine that there were 100 people and you had t-shirts to give away with each of the seven colors.
- Because we are computer scientists, the first person is 0. The last person is 99.
- How would you pass out t-shirts so that the colors remain relatively equal?

## Solution!

- Cycle through each color when passing out the t-shirts, starting with RED to Person 0.
- Person 1 gets ORANGE.
- Person 2 gets YELLOW.
- Person 3 gets GREEN.
- Person 7 gets RED again!
- What color would person 99 get? Take a moment to think about this.

## Can we represent this with math?

- Yes!
- Compute 99 divided by 7 and find the remainder.
- In this case, it's 1. The t-shirt color corresponding to 1 is ORANGE.
- Person 99 gets an ORANGE t-shirt.
- The Java symbol for remainder is "%".
- 99 % 7 is equal to 1.

## New Project: Art

- Create a new project called "Art".
- Import the TurtleLog.jar library.
- We will ask the user for an integer representing the number of sides of the desired shape and draw that shape.
- Because we are starting out, we will begin with a new shape: the triangle.
- A triangle has 3 sides.
- A triangle requires that we turn 120 degrees to the left each time we move.

## Just like last time.

Modify the line containing "public class Art {" to look like this.

    public class Art extends Sandbox

You will have to fix your code's imports to make the error on "Sandbox" go away.

## Start Programming.

In your main method, add one line of code. It will look like this.

    public static void main(String[] args) {
        launch(args);
    }

## Place a turtle

Create a new method called "draw".

    @Override
    public void draw() {
        Random rng = new Random();
        Turtle turtle = new Turtle();
        add(turtle);
    }

You will need to fix imports.

## Create the array of colors

    Color[] colors = {Color.RED, Color.ORANGE,
                      Color.YELLOW, Color.GREEN,
                      Color.BLUE, Color.INDIGO,
                      Color.VIOLET };

Here "Color" is a type that we haven't discussed before. Yes, color can be represented as a variable!

## Move the turtle 1000 times

    for (int i = 0; i < 1000; i++) {
        turtle.setColor(colors[i % 7]);
        int size = rng.nextInt(100) + 50;
        int degrees = rng.nextInt(360) - 180;
        turtle.forward(size);
        turtle.left(degrees);
    }

## Watch your turtle move!

- This display will cause the turtle to move randomly and turn randomly around the screen.
- No one will have the same artwork on their screen!
- Each line should be one of the seven colors.

## Next art: Triangle Sprial.

To get started on this, remove the for loop and all the code inside.

## Here we go.

This for loop will end in three slides. Put everything on the next few slides inside of this for loop.

    for (int i = 0; i < 72; i++) {
        turtle.up();
        turtle.forward(size / 2);
        turtle.down();
        turtle.setColor(colors[i % 7]);
        turtle.left(150);

## Part 2

This draws one triangle.

        for (int s = 0; s < 3; s++) {   
            turtle.forward(size);
            turtle.left(120);
        }

## Part 3

        turtle.left(30);
        turtle.up();
        turtle.forward(size / 2);
        turtle.down();
        turtle.left(185);
    } // End the for loop

Watch the art work happen!
