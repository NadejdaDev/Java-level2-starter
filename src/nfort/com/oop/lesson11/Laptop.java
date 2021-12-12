package nfort.com.oop.lesson11;

/**
 * Mobile <- Laptop <- Computer <- Object
 */
public final class Laptop extends Computer{
    private int weight;

    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static init bloc laptop");
    }

    public Laptop(Ssd ssd, Ram ram, int weight){
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("constructor laptop");
    }

    @Override
    public void load() {
        System.out.println("Я загрузился");
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
