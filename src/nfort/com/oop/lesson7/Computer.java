package nfort.com.oop.lesson7;

public class Computer {

    private Ram ram;
    private Ssd ssd;
    private static int counter = 0;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++; //this.counter использовать нельзя т.к. static относится не к объектам, а к классам
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }
}
