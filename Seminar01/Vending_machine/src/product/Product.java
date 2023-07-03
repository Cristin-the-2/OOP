package Projects_OOP.Seminar01.Vending_machine.src.product;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price + "р.";
    }
}
