package nfort.com.oop.lesson11;

/**
 * Mobile <- Laptop <- Computer <- Object
 */
public final class Laptop extends Computer{
    private int weight;

//    {
//        System.out.println("init block laptop");
//    }
//
//    static {
//        System.out.println("static init bloc laptop");
//    }

    public Laptop(Ssd ssd, Ram ram, int weight){
        super(ssd, ram);
        this.weight = weight;
//        System.out.println("constructor laptop");
    }

    public Laptop() {
//        System.out.println("constructor laptop");
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight: " + weight);
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
