package nfort.com.oop.lesson15;

public class Mage extends Hero{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " колдует. Врага зовут " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
