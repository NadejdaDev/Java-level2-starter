package nfort.com.oop.lesson11;

public class OopLessonRunner {

    public static void main(String[] args) {

        Ssd ssd = new Ssd(500);
        Ram ram = new Ram(1024);
//        Computer computer = new Computer(ssd, ram);
//        computer.load();

        Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 2);
        laptop.open();
        laptop.load();
    }
}
