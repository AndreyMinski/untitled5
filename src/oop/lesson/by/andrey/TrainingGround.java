package oop.lesson.by.andrey;

public class TrainingGround {
    public static void main(String[] args) {

        Hero warior = new Warior("Викинг", 20);

        Hero archer = new Archer("Лучник", 10);

        Hero mag = new Mag("Эльф", 15);

        Enemy enemy = new Enemy("Зомби", 100);

        attackEnemy(enemy, warior, archer, mag);


    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                 }
            }
        }
    }
}