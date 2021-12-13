package nfort.com.oop.lesson15;

public class BattleGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy("Враг", 105);
        Archer archer = new Archer("Archer",10);
        Warrior warrior = new Warrior("Warrior", 15);
        Mage mage = new Mage("Mage", 20);


        attackEnemy(enemy, archer, warrior, mage);
    }

    private static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()){
            for(Hero hero : heroes ) {
                if(enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
