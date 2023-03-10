package org.example;

public class Man extends Cat {
    private int maxDistance = 100;
    private int maxHeight = 1;


    public Man(String name, int maxDistance, int maxHeight) {
        super(name, maxDistance, maxHeight);

    }

    public Man(String name) {
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
        return "Человек " + getName() + " дистанция = " + maxDistance + " прыжки = " + maxHeight;
    }
}
