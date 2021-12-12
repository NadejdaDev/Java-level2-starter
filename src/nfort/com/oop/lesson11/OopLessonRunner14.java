package nfort.com.oop.lesson11;

public class OopLessonRunner14 {

    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(516));
        Laptop laptop2 = new Laptop(new Ssd(5000), new Ram(10000), 5);

        printWithRandom(laptop, mobile, laptop2);
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
//            Printable.generateRandom();
            System.out.println();
        }
    }
}
