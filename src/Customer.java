import java.util.Random;
import java.util.Scanner;

public class Customer {
    VendingMachine machine = new VendingMachine();
    private int coins;

    public Customer() {
        this.coins = putCoins();
    }

    public int putCoins(){
        System.out.print("Put coins in the machine: ");
        int money = new Scanner(System.in).nextInt();
        return money;
    }


    public void printProducts(){
        for (int i = 0; i < machine.getProducts().size(); i++) {
            if(getCoins() > machine.getProducts().get(i).getPrice()) {
                System.out.printf("%s - Type: %-9s -- >   Price: %s\n", i, machine.getProducts().get(i).getType(),
                        machine.getProducts().get(i).getPrice());
            }
        }
    }

    public int getCoins() {
        return coins;
    }
}
