public class HDD {
    int size;
    String type;

    public HDD(int size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
