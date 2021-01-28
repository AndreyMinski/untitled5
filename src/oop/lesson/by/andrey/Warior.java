package oop.lesson.by.andrey;

public class Warior extends Hero {

    public Warior(String name,int demage) {
        super(name,demage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+ " ударил мечем по "+ enemy.getName());
        enemy.takeDemage(getDemage());
    }
}
