package com.example.oopspaceinvadersrealyp;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image bg = new Image(getClass().getResourceAsStream("space.jpg"));
        ImageView iView = new ImageView(bg);

        Image ship = new Image(getClass().getResourceAsStream("ship2.png"));
        ImageView iView2 = new ImageView(ship);

        Image enemy = new Image(getClass().getResourceAsStream("enemyShip.png"));
        ImageView iView3 = new ImageView(enemy);

        double sceneWidth = 1024;
        double sceneHeight = 720;
        double shipWidth = ship.getWidth();
        double shipHeight = ship.getHeight();
        double shipX = (sceneWidth - shipWidth) / 2;
        double shipY = sceneHeight - shipHeight - 20;
        iView2.setX(shipX);
        iView2.setY(shipY);


        //playerShip = new Ship();

        Group myG = new Group();
        myG.getChildren().add(iView);
        myG.getChildren().add(iView2);
        myG.getChildren().add(iView3);
        Scene scene = new Scene(myG, sceneWidth, sceneHeight);
        stage.setTitle("Space Invaders RZ");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event){

                if (event.getCode() == KeyCode.D) {
                    iView2.setLayoutX(iView2.getLayoutX() + 10);
                } else if (event.getCode() == KeyCode.A) {
                    iView2.setLayoutX(iView2.getLayoutX() - 10);
                }
            }
        });



    }

    public static void main(String[] args) {
        launch();
    }
}
