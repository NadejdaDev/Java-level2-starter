package nfort.com.oop.lesson15;

import nfort.com.oop.lesson18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " колдует. Врага зовут " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
