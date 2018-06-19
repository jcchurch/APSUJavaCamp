package src;

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

    public void up() {
        this.drawing = false;
    }

    public void down() {
        this.drawing = true;
    }

    public void hide() {
        this.showTurtle = false;
    }

    public void show() {
        this.showTurtle = true;
    }

    public void goTo(double x, double y) {
        context.moveTo(x, y);
        this.assignXandY(x, y);
    }
    
    public void goHome() {
        this.goTo(this.homex, this.homey);
    }

    public void setScale(double width) {
        this.scale = width;
        this.context.setLineWidth(width);
    }
    
    public void setColor(Paint paint) {
        this.context.setStroke(paint);
    }

    public void forward(double distance) {
        double newx = this.x + distance * Math.cos(theta);
        double newy = this.y + distance * Math.sin(theta);
        if (this.drawing) {
            this.drawLineTo(newx, newy);
        } else {
            this.goTo(newx, newy);
        }
    }

    public void forward() {
        this.forward(100);
    }
    
    public void backward(double distance) {
        this.forward(-distance);
    }
    
    public void backward() {
        this.forward(-100);
    }

    public void left(double degrees) {
        double radians = convertDegreesToRadians(degrees);
        this.theta -= radians;
    }

    public void left() {
        this.left(90);
    }

    public void right(double degrees) {
        double radians = convertDegreesToRadians(degrees);
        this.theta += radians;
    }

    public void right() {
        this.right(90);
    }

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
