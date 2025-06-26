class Buyer {
    private String name;

    public Buyer(String name) {
        this.name = name;
    }

    public void purchases(Laptop laptop) {
        System.out.print(name + "buys "+laptop.toString());
        ;
    }
}