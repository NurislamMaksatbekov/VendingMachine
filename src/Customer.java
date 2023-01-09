import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    private int coins;

    public Customer() {
        this.coins = putCoins();
    }

    public int putCoins(){
        System.out.print("Put coins in the machine: ");
        int money = new Scanner(System.in).nextInt();
        return money;
    }


    public int getCoins() {
        return coins;
    }
}
