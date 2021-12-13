package nfort.com.oop.lesson15;

public class Warrior extends Hero{

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " машет мечом. Врага зовут " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
