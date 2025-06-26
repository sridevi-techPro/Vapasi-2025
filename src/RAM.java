public class RAM {

    int size;
    String gen;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "size=" + size +
                ", gen='" + gen + '\'' +
                '}';
    }
}
