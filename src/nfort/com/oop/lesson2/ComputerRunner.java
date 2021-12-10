package nfort.com.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.load();

        System.out.println("Ram: " + computer.ram);
        System.out.println("Ssd: " + computer.ssd);
    }
}
