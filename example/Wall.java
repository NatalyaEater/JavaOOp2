package org.example;

public class Wall {
    private int height;
    public Wall(int height) {
        this.height = height;
    }
    public Wall(){
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Прыжки = " +
                height;
    }
}
