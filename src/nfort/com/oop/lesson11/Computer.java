package nfort.com.oop.lesson11;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    {
        System.out.println("init block computer");
    }

    static {
        System.out.println("static init bloc computer");
    }

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
        System.out.println("constructor computer");
    }

    public void load() {
        System.out.println("Я загрузился!");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
