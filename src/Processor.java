public class Processor {

    int gHz;
    String gen;

    public int getgHz() {
        return gHz;
    }

    public void setgHz(int gHz) {
        this.gHz = gHz;
    }

    public String getGen() {
        return gen;
    }



    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "gHz=" + gHz +
                ", gen='" + gen + '\'' +
                '}';
    }

}
