package nfort.com.oop.lesson15;

public class Archer extends Hero{

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стреляет из лука. Врага зовут " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
