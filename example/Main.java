package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Участники забега и их возможности :  ");

        Cat[] team = new Cat[3];
        team[0] = new Man("Вася");
        team[1] = new Cat("Пушок");
        team[2] = new Robot("Валли");

        Runroad[]  run= new Runroad[1];
        run[0] = new Runroad(100);
        Wall[]  run2= new Wall[1];
        run2[0] = new Wall(5);


        for (int i = 0; i < team.length; i++)
        {
            System.out.println(team[i]);
        }

        System.out.println();
        System.out.println("Полоса препятствий: "+run[0]+"  "+run2[0]);

        for (int i = 0; i < team.length; i++){
            for (int j = 0; j < run.length; j++){
                for (int k = 0; k < run2.length; k++)
                {
                    if (team[i].run(run[j].getDistance()))
                    {
                        team[i].jump(run2[k].getHeight());

                    }
                }
            }
                System.out.println();
        }
    }
}