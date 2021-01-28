package oop.lesson.by.andrey;

public class Enemy implements Mortal {
    private String name;

    public Enemy(String name, int healt) {
        this.name = name;
        this.healt = healt;
    }

    public void takeDemage(int demage) {
        if (isAlive() && healt <= demage) {
            healt = 0;
            System.out.println(getName() + " погиб");
        } else
            this.healt -= Math.min(healt, demage);
        System.out.println(name + " получил урон " + demage + ". Осталось " + healt);

    }

    public void setHealt(int healt) {

        this.healt = healt;
    }

    public String getName() {

        return name;
    }

    public int getHealt() {

        return healt;
    }


    private int healt;

    @Override
    public boolean isAlive() {
        return healt > 0;

    }
}
