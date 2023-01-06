import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VendingMachine {
    List<Product> products;

    public VendingMachine() {
        this.products = createProduct();
    }

    public List<Product> createProduct(){
        String[]typeProduct = new String[]{"Candy", "Snickers", "Apple", "Water", "Soda"};
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < typeProduct.length; i++) {
            String type = typeProduct[i];
            products.add(new Product(type, new Random().nextInt(61)+20));
        }
        return products;
    }
}
