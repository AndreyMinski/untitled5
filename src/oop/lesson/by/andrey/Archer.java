package oop.lesson.by.andrey;

public class Archer extends Hero {

    public Archer(String name,int demage) {
        super(name,demage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+ " стрельнул из лука в "+ enemy.getName());
        enemy.takeDemage(getDemage());
    }
}
