package oop.lesson.by.andrey;

public class Mag extends Hero {

    public Mag(String name,int demage) {
        super(name,demage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+ " применил заклинание  на " + enemy.getName());
        enemy.takeDemage(getDemage());
    }

}
