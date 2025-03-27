package com.example.oopspaceinvadersrealyp;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ship extends Sprite{

    private boolean left, right, up, down;

    Ship(double x, double y, int xSpeed, int ySpeed){
        super(x, y, xSpeed, ySpeed,"ship2.png");

    }
}
