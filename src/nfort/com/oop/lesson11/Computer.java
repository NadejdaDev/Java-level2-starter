package nfort.com.oop.lesson11;

public abstract class Computer implements Printable{

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        super();
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
    }

    @Override
    public void print() {
        System.out.println("Ssd: " + ssd.getValue() + ", ram: " + ram.getValue());
    }

    public abstract void load();

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
