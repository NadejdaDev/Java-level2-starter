package nfort.com.oop.lesson7;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(1024);
        Computer computer = new Computer(ram, ssd);

        computer.printState();
    }
}
