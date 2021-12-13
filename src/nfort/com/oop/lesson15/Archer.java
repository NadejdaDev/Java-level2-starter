package nfort.com.oop.lesson15;

public class Archer extends Hero {
    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {

//        class Test {                      // для локального класса
//        }
//        new Test();

        System.out.println(getName() + " стреляет из лука. Врага зовут " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    public class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный удар.");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
