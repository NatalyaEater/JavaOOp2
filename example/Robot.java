package org.example;

public class Robot extends Cat {
    private int maxDistance = 200;
    private int maxHeight = 10;

    public Robot(String name) {
        super(name);
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString()
    {
        return "Робот " + getName() +" дистанция = " + maxDistance + " прыжки = " + maxHeight;
    }
}