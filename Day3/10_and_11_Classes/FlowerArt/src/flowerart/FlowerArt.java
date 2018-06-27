/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerart;


import javafx.scene.paint.Color;
import turtles.Sandbox;

/**
 *
 * @author jcchurch
 */
public class FlowerArt extends Sandbox {

    @Override
    public void draw() {
        RandomFlower flower = new RandomFlower();
        add(flower.get());
        
        for (int i = 0; i < 100; i++) {
            flower.draw();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
