package org.example;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;

public class MainView extends VBox {

    private Button stepButton;
    private Canvas canvas;
    private SphereMap sphereMap;
    private Grass grass;
    private Affine affine;

    public MainView() {
        stepButton = new Button("step");
        this.canvas = new Canvas(400, 400);

        this.getChildren().addAll(this.stepButton, this.canvas);

        this.sphereMap = new SphereMap(10,10);

        this.grass = new Grass(sphereMap,new Vector2d(2,2));

        this.affine = new Affine();
        this.affine.appendScale(40, 40);

    }

    public void draw() {
        GraphicsContext g = this.canvas.getGraphicsContext2D();
        g.setTransform(this.affine);

        g.setFill(Color.BROWN);
        g.fillRect(0, 0, 400, 400);

        for (int x = 0; x<this.sphereMap.width; x++) {
            for (int y = 0; y < this.sphereMap.height; y++) {
                if (this.grass.getPosition().equals(new Vector2d(x, y))) {
                    g.setFill(Color.BLACK);
                    g.fillRect(x, y, 1, 1);
                } else {
                    g.setFill(Color.GREEN);
                    g.fillRect(x, y, 1, 1);
                }
            }
        }}}
