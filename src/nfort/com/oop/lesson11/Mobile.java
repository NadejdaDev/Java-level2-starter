package nfort.com.oop.lesson11;

public class Mobile extends Computer{

//    {
//        System.out.println("init block mobile");
//    }
//
//    static {
//        System.out.println("static init bloc mobile");
//    }

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
//        System.out.println("constructor mobile");
    }

    @Override
    public void load() {
        System.out.println("Я включился");
    }
}
