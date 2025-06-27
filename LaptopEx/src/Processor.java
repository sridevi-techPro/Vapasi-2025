public class Processor {
    String Generation;
    int GHz;

    public Processor(String generation, int GHz) {
        Generation = generation;
        this.GHz = GHz;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "Generation='" + Generation + '\'' +
                ", GHz=" + GHz +
                '}';
    }
}
