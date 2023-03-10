package org.example;

public class Runroad{
    private int distance;

    public Runroad(){
    }
    public Runroad(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Забег = " + distance +" метров";
    }
}


