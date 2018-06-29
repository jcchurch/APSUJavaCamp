/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author jcchurch
 */
public class PaintApp extends Application {

    public double size;
    public int shape;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        size = 10;
        shape = 0;
        int width = 600;
        int height = 600;
        
        Canvas canvas = new Canvas(width, height);
        Label sizeLabel = new Label("Size: ");
        Canvas colors = new Canvas(360, 50);
        
        Slider slider = new Slider(1, 200, 10);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        
        Button circle = new Button("Circle");
        Button square = new Button("Square");
        Button clear = new Button("Clear All");
        
        HBox buttons = new HBox();
        buttons.getChildren().addAll(clear, circle, square);
        buttons.setAlignment(Pos.CENTER);
        
        HBox sliderPane = new HBox();
        sliderPane.getChildren().addAll(sizeLabel, slider);
        sliderPane.setAlignment(Pos.CENTER);

        VBox vPane = new VBox();
        vPane.getChildren().addAll(canvas, buttons, sliderPane, colors);
        vPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        GraphicsContext colorC = colors.getGraphicsContext2D();
        GraphicsContext canvasC = canvas.getGraphicsContext2D();
        canvasC.setFill(Color.WHITE);
        canvasC.fillRect(0, 0, width, height);
        canvasC.setFill(Color.BLUE);

        for (int i = 0; i < 360; i++) {
            Color c = Color.hsb(i, 1, 1);
            colorC.setStroke(c);
            colorC.strokeLine(i, 0, i, 49);
        }
        
        colors.setOnMouseClicked(event -> {
            double x = event.getX();
            Color c = Color.hsb(x, 1, 1);
            canvasC.setFill(c);
        });

        canvas.setOnMouseDragged(event -> {
            draw(event, canvasC);
        });
        
        canvas.setOnMouseClicked(event -> {
            draw(event, canvasC);
        });
        
        slider.setOnMouseClicked(event -> {
            size = slider.getValue();
        });
        
        slider.setOnMouseDragged(event -> {
            size = slider.getValue();
        });
        
        circle.setOnAction(event -> {shape = 0;});
        square.setOnAction(event -> {shape = 1;});
        
        clear.setOnAction(event -> {
            Paint c = canvasC.getFill();
            canvasC.setFill(Color.WHITE);
            canvasC.fillRect(0, 0, width, height);
            canvasC.setFill(c);
        });
    }

    private void draw(MouseEvent event, GraphicsContext gc) {
        double x = event.getX();
        double y = event.getY();
        double half = size / 2;
        
        if (shape == 0)
            gc.fillOval(x-half, y-half, size, size);
        
        if (shape == 1)
            gc.fillRect(x-half, y-half, size, size);
    }

}
