package nfort.com.oop.lesson2;

public class Computer {

    int ssd = 500;
    int ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 990;
    }

    Computer(int ssd, int newRam) {
        this.ssd = ssd;
        ram = newRam;
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
