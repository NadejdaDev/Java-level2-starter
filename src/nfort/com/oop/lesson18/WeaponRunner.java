package nfort.com.oop.lesson18;

import nfort.com.oop.lesson15.Archer;
import nfort.com.oop.lesson15.Hero;
import nfort.com.oop.lesson15.Mage;
import nfort.com.oop.lesson15.Warrior;
import nfort.com.oop.lesson18.weapon.Bow;
import nfort.com.oop.lesson18.weapon.Sword;
import nfort.com.oop.lesson18.weapon.Wand;
import nfort.com.oop.lesson18.weapon.Weapon;

public class WeaponRunner {

    public static void main(String[] args) {

        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        Mage<Wand> mage = new Mage<>("Гендольф", 20);
        mage.setWeapon(new Wand());

        printWeaponDamage(archer);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }

//    public static void printWeaponDamage(Hero<? extends Weapon> hero) {
//        System.out.println(hero.getWeapon().getDamage());
//    }
}
