public class Laptop {

    String logo ="mac";

    private Processor processor ;
    private RAM ram ;
    private HDD hdd;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "logo='" + logo + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
