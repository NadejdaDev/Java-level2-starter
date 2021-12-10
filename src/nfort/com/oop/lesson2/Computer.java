package nfort.com.oop.lesson2;

public class Computer {

    private int ssd = 500;
    private int ram;

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 990;
    }

    protected Computer(int ssd, int newRam) {
        this.ssd = ssd;
        ram = newRam;
    }

    public Computer() {
        System.out.println("Я был создан");
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        if(open) {
            System.out.println("Я открыл крышку");
        }
    }

    void printState() {
//        load();
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
