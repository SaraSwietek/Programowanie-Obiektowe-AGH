package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class Grass {

    private Vector2d position;

    public Grass(Vector2d position) {
        this.position = position;
    }

    public Vector2d getPosition() {
        return position;
    }

    @Override
    public String toString(){
        return "*";
    }
}
