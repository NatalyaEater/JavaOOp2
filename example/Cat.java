package org.example;

public class Cat implements Ability{
    private String name;
    private int maxDistance=10;
    private int maxHeight=2;



    public Cat(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }


    @Override
    public boolean run(int distance){
        if (distance <= getMaxDistance())
        {
            System.out.println(name  + "   прошел успешно забег");
            return true;
        }
        else {
            System.out.println(name  + "   проиграл на забеге");
            return false;
        }
    }

    @Override
    public boolean jump(int height){
        if (height <= getMaxHeight())
        {
            System.out.println(name  + "   прошел прыжки");
            return true;
        } else
        {
            System.out.println(name  + "   проиграл на прыжках");
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "Кися " + name + " дистанция = " + maxDistance + " прыжки = " + maxHeight;
    }

}
