package nfort.com.oop.lesson17;

public enum ProcessorType implements Describable{
    BIT_32("bit_32")
//            {                                     // если создавать абстрактный класс в Enam, то переопределять его нужно
//        @Override                                 // прямо в объектах в фигурных скобках
//        public String getDescription() {
//            return "bit 32 description";
//        }
//    }
    ,
    BIT_64("bit_64");

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }

    public String getName(){
        return name;
    }
}
