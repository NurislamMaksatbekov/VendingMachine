public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.products.forEach(System.out::println);
    }
}