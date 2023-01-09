import java.util.*;

public class VendingMachine {
    private List<Product> products;
    private String[]typeProduct = new String[]{"Candy", "Snickers", "Apple", "Water", "Soda"};
    private static final Customer customer = new Customer();

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
                if(products.get(choose).getPrice() <= customer.getCoins()) {
                    System.out.println("You bought: " + products.get(choose));
                    customer.setCoins(customer.getCoins() - products.get(choose).getPrice());
                } else if (products.get(choose).getPrice() > customer.getCoins()){
                    printException();
                    chooseProduct();
                }
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                printException();
                chooseProduct();
            }


    }
    private void printException(){
        System.out.println("Enter correct data!\n" +
                "Try again!");
    }
    public void availableProducts() {
        System.out.println("Available products in the machine!");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("(%s) - Type: %-9s -- >   Price: %s\n", i, products.get(i).getType(),
                    products.get(i).getPrice());
        }
    }
    public void printProducts(){
        System.out.println("Available products for your balance!");
        for (int i = 0; i < products.size(); i++) {
            if(customer.getCoins() >= products.get(i).getPrice()) {
                System.out.printf("(%s) - Type: %-9s -- >   Price: %s\n", i, products.get(i).getType(),
                        products.get(i).getPrice());
            }
        }
    }

    public void chooseAction(){
        availableProducts();
        System.out.println("Your balance " + customer.getCoins());
        System.out.println("(1) Put coins\n" +
                "(2) Quit");
        System.out.print("Choose action: ");
        try{
            int choose = new Scanner(System.in).nextInt();
            switch (choose){
                case 1:
                    customer.putCoins();
                    System.out.println("Your balance: " + customer.getCoins());
                    printProducts();
                    chooseProduct();
                    chooseAction();
                    break;
                case 2:
                    break;
            }
            if(choose > 2 || choose <= 0){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException e){
            printException();
            chooseAction();
        }
    }
}
