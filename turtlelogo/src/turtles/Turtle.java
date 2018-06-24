package turtles;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

/**
 *
 * @author churchj
 */
public final class Turtle {

    private GraphicsContext context;
    private double theta;
    private double scale;
    private double x;
    private double y;
    private double homex;
    private double homey;
    private boolean drawing;
    private boolean showTurtle;

    public Turtle() {
    }

    /**
     * Initializes the Turtle in the center of a Canvas. Records this location as its home. Throws an IllegalArgumentException if Canvas is null.
     *
     * @param canvas the canvas on which we place a turtle.
     */
    public void initialize(Canvas canvas) {
        if (canvas == null) {
            throw new IllegalArgumentException("The canvas is null.");
        }

        this.context = canvas.getGraphicsContext2D();
        this.drawing = true;
        this.showTurtle = true;

        double centerx = canvas.getWidth() / 2.0;
        double centery = canvas.getHeight() / 2.0;
        this.goTo(centerx, centery);
        this.setScale(1);
        
        this.homex = centerx;
        this.homey = centery;
    }

    /**
     * Raises the pen (or tail) of this turtle so that it no longer draws to the screen. The default state of the turtle's tail is lowered.
     */
    public void up() {
        this.drawing = false;
    }

    /**
     * Lowers the pen (or tail) of this turtle so that it will longer draws to the screen. The default state of the turtle's tail is lowered.
     */
    public void down() {
        this.drawing = true;
    }

    /**
     * Prevents the turtle (i.e. the arrow) from being drawn to the screen. The default state is that the arrow is drawn.
     */
    public void hide() {
        this.showTurtle = false;
    }

    /**
     * Draws the turtle (i.e. the arrow) on the screen. The default state is that the arrow is drawn.
     */
    public void show() {
        this.showTurtle = true;
    }

    /**
     * Moves the turtle to an (x,y) location in the window. The upper-right corner of the screen is location (0, 0). This will draw if the tail is down.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void goTo(double x, double y) {
        context.moveTo(x, y);
        this.assignXandY(x, y);
    }
    
    /**
     * Moves the turtle to the home location in the window (i.e. where the turtle started). This will draw if the tail is down.
     */
    public void goHome() {
        this.goTo(this.homex, this.homey);
    }

    /**
     * Sets the scale of the turtle. This impacts the line width and the size of the arrow. The default scale is 1.
     *
     * @param width the desired line width of the turtle.
     */
    public void setScale(double width) {
        this.scale = width;
        this.context.setLineWidth(width);
    }
    
    /**
     * Sets the color of the turtle. The default color is black.
     *
     * @param paint the desired color
     */
    public void setColor(Paint paint) {
        this.context.setStroke(paint);
    }

    /**
     * Moves the turtle forward a desired distance.
     *
     * @param distance the desired distance
     */
    public void forward(double distance) {
        double newx = this.x + distance * Math.cos(theta);
        double newy = this.y + distance * Math.sin(theta);
        if (this.drawing) {
            this.drawLineTo(newx, newy);
        } else {
            this.goTo(newx, newy);
        }
    }

    /**
     * Moves the turtle forwards 100 units.
     */
    public void forward() {
        this.forward(100);
    }

     /**
     * Moves the turtle backwards a desired distance.
     *
     * @param distance the desired distance
     */
    public void backward(double distance) {
        this.forward(-distance);
    }
    
    /**
     * Moves the turtle backwards 100 units.
     */
    public void backward() {
        this.forward(-100);
    }

    /**
     * Turns the turtle to the left to a specified degree.
     *
     * @param degrees the desired degree to turn.
     */
    public void left(double degrees) {
        double radians = convertDegreesToRadians(degrees);
        this.theta -= radians;
    }

    /**
     * Causes the turtle to make a corner turn to the left. Same as saying `left(90)`.
     */
    public void left() {
        this.left(90);
    }

    /**
     * Turns the turtle to the right to a specified degree.
     *
     * @param degrees the desired degree to turn.
     */
    public void right(double degrees) {
        double radians = convertDegreesToRadians(degrees);
        this.theta += radians;
    }

    /**
     * Causes the turtle to make a corner turn to the right. Same as saying `right(90)`.
     */
    public void right() {
        this.right(90);
    }

    /**
     * Draws the arrow if the turtle is set to `show`. Otherwise this does nothing. The default state is to draw the turtle.
     */
    public void drawArrow() {
        if (this.showTurtle) {
            boolean originalPenState = this.drawing;

            this.left(135);
            this.down();
            this.forward(this.scale * 5);
            this.up();
            this.left(135);
            this.forward(this.scale * 7.07);
            this.left(135);

            this.down();
            this.forward(this.scale * 5);
            this.right(45);

            this.drawing = originalPenState;
        }
    }

    private double convertDegreesToRadians(double degrees) {
        return (Math.PI * degrees) / 180.0;
    }

    private void drawLineTo(double x, double y) {
        this.context.strokeLine(this.x, this.y, x, y);
        this.assignXandY(x, y);
    }

    private void assignXandY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
