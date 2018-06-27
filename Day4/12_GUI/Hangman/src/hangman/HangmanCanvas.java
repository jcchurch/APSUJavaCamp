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

public class HangmanCanvas extends Canvas {
    
    private String word;
    private char[] letters;
    private int lives = 0;
    private char[] revealed;
    private int blanks;
    
    public HangmanCanvas(String w, double width, double height) {
        super(width, height);
        
        letters = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        lives = 5;
        word = w;
        revealed = new char[word.length()];
        blanks = word.length();
    }
    
    public boolean lost() {
        return lives == 0;
    }
    
    public boolean won() {
        return blanks == 0;
    }
    
    public void scratch(char letter) {

        for (int i = 0; i < letters.length; i++) {
            if (letter == letters[i]) {
                letters[i] = ' '; // <- Empty space ' '
            }
        }
 
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                revealed[i] = letter;
                found = true;
                blanks--;
            }
        }
        
        if (found == false) {
            lives--;
        }
    }
    
    public void draw() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.setLineWidth(3);
        gc.setStroke(Color.BLUE);
        
        if (lives <= 4) {
            // Body
            gc.strokeLine(150, 50, 150, 150);
        }
        
        if (lives <= 3) {
            // Legs
            gc.strokeLine(125, 175, 150, 150);
            gc.strokeLine(175, 175, 150, 150);
        }
        
        if (lives <= 2) {
            // Arms
            gc.strokeLine(125, 75, 175, 75);
        }
        
        if (lives <= 1) {
            // Head
            gc.strokeOval(135, 20, 30, 30);
        }
        
        if (lives == 0) {
            // Face
            gc.fillOval(144, 30, 3, 3);
            gc.fillOval(154, 30, 3, 3);
            gc.strokeArc(145, 40, 10, 5, 0, 180, ArcType.OPEN);
        }
        
        for (int i = 0; i < 13; i++) {
            int x = 20 * i + 40;
            gc.strokeText(""+letters[i], x, 200);
            gc.strokeText(""+letters[i+13], x, 220);
        }

        gc.setStroke(Color.RED);
        for (int i = 0; i < word.length(); i++) {
            int x = 20 * i + 40;
            gc.strokeText(""+revealed[i], x, 240);
        }
    }
}
