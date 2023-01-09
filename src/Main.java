public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
//        machine.getProducts().forEach(System.out::println);
//        machine.chooseProduct();
        Customer customer = new Customer();

        customer.printProducts();
        machine.chooseProduct();
    }
}