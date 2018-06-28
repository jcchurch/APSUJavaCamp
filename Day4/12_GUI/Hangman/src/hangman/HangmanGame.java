/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class HangmanGame {

    private Canvas canvas;
    private char[] alpha;
    private char[] revealed;
    private int blanks;
    private int lives;
    private String word;
    
    public HangmanGame(double width, double height) {        
        alpha = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        lives = 5;
        word = "ENVELOPE";
        revealed = new char[word.length()];
        blanks = word.length();
        canvas = new Canvas(width, height);
    }
    
    public Canvas getCanvas() {
        return canvas;
    }
    
    public boolean lost() {
        return lives == 0;
    }
    
    public boolean won() {
        return blanks == 0;
    }
    
    public void scratch(char letter) {
        for (int i = 0; i < alpha.length; i++)
            if (letter == alpha[i])
                alpha[i] = ' ';
 
        int i = word.indexOf(letter);
        if (i == -1)
            lives--;
        
        while (i != -1) {
            revealed[i] = letter;
            blanks--;
            i = word.indexOf(letter, i+1);
        }
    }
    
    public void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setStroke(Color.BLUE);
        
        if (lives <= 4)
            gc.strokeLine(150, 50, 150, 150);
        
        if (lives <= 3) {
            gc.strokeLine(125, 175, 150, 150);
            gc.strokeLine(175, 175, 150, 150);
        }
        
        if (lives <= 2)
            gc.strokeLine(125, 75, 175, 75);
        
        if (lives <= 1)
            gc.strokeOval(135, 20, 30, 30);
        
        if (lives == 0) {
            gc.fillOval(144, 30, 3, 3);
            gc.fillOval(154, 30, 3, 3);
            gc.strokeArc(145, 40, 10, 5, 0, 180, ArcType.OPEN);
        }
        
        String display = (new String(alpha)).replace("", " ");
        gc.strokeText(display.substring(0, 28), 40, 200);
        gc.strokeText(display.substring(28), 40, 220);
        gc.setStroke(Color.RED);
        gc.strokeText(new String(revealed).replace("", " "), 40, 240);
    }
}
