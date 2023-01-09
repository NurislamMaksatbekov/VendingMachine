import java.util.*;

public class VendingMachine {
    private List<Product> products;
    private String[]typeProduct = new String[]{"Candy", "Snickers", "Apple", "Water", "Soda"};
    Customer customer = new Customer();


    public VendingMachine() {
        this.products = createProduct();
    }


    public List<Product> createProduct(){
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < typeProduct.length; i++) {
            String type = typeProduct[i];
            products.add(new Product(type, new Random().nextInt(61)+20));
        }
        return products;
    }
    public void chooseProduct(){
        try {
            int choose = new Scanner(System.in).nextInt(typeProduct.length);
            System.out.println("You chose: " + products.get(choose));
        }catch (InputMismatchException | IndexOutOfBoundsException e){
            printException();
            chooseProduct();
        }
    }
    private void printException(){
        System.out.println("Enter correct data!\n" +
                "Try again!");
    }
    public void printProducts(){
        for (int i = 0; i < products.size(); i++) {
            if(customer.getCoins() >= products.get(i).getPrice()) {
                System.out.printf("(%s) - Type: %-9s -- >   Price: %s\n", i, products.get(i).getType(),
                        products.get(i).getPrice());
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
