package nfort.com.oop.lesson15;

import nfort.com.oop.lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T>{

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " машет мечом. Врага зовут " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
