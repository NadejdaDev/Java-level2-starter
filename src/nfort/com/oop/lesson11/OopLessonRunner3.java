package nfort.com.oop.lesson11;

public class OopLessonRunner3 {

    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(516));
        Laptop laptop2 = new Laptop(new Ssd(5000), new Ram(10000), 5);

        printComputers(new Computer[]{laptop, mobile, laptop2});
//        loadComputers(laptop, mobile);
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
     public static void printComputers(Computer[] computers) {
         for (Computer computer : computers) {
             computer.print();
             if(computer instanceof Laptop){
                 Laptop laptop = (Laptop) computer;
                 laptop.open();
             }
             System.out.println();
         }
     }
}
