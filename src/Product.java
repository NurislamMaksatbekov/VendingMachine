public class Product {
    private String type;
    private int price;

    public Product(String type, int price) {
        this.type = type;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
