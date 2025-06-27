public class Laptop {

    String name ="Mac";

    HDD hdd;
    RAM ram;
    Processor processor;

    public Laptop(HDD hdd, RAM ram, Processor processor) {
        this.hdd = hdd;
        this.ram = ram;
        this.processor = processor;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                ", name='" + name + '\'' +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", processor=" + processor +
                '}';
    }


}
