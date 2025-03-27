package com.example.oopspaceinvadersrealyp;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite {

    protected double x, y;
    protected int xSpeed, ySpeed;

    protected Image img;
    protected ImageView iView;

    Sprite(double x, double y, int xSpeed, int ySpeed, Image img, ImageView iView){

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        img = new Image((getClass().getResourceAsStream("ship2.png")));
        iView = new ImageView(img);
    }


}
