package oop.lesson.by.andrey;

public abstract class Hero <T> {
    private String name;
    private int demage;
    private T weapon;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getDemage() {
        return demage;
    }

    public Hero(String name, int demage) {

        this.name = name;
        this.demage = demage;

    }
    public abstract void attackEnemy(Enemy enemy);


}
