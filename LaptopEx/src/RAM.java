public class RAM {
    int size;
    String generation;

    public RAM(int size, String generation) {
        this.size = size;
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "size='" + size + '\'' +
                ", generation='" + generation + '\'' +
                '}';
    }
}
