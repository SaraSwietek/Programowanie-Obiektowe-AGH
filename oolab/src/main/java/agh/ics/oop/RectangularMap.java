package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap{
    private int width = 5;
    private int height = 5;
    //public List<Animal> animals = new ArrayList<>();

    public RectangularMap(int width, int height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public boolean canMoveTo(Vector2d position) {
        if(position.x > this.width)
            return false;

        if(position.x < 0)
            return false;

        if(position.y > this.height)
            return false;

        if(position.y < 0)
            return false;

        if(this.isOccupied(position))
            return false;

        return true;
    }
/*
    @Override
    public boolean place(Animal animal) {
        if (isOccupied(animal.getPosition()))
            return false;
        if (!canMoveTo(animal.getPosition()))
            return false;
        animals.add(animal);
        //Vector2d positioon = animal.getPosition();
        //animals.put(positioon, new Animal(positioon, map));
        return true;
    }
*/
    @Override
    public String toString(){
        MapVisualizer map = new MapVisualizer(this);
        return map.draw(new Vector2d(0,0),new Vector2d(width, height));
    }
}


