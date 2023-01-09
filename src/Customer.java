import java.util.Scanner;

public class Customer {
    private int coins;

    public Customer() {
        this.coins = 0;
    }

    public void putCoins(){
        System.out.print("Put coins in the machine: ");
        int money = new Scanner(System.in).nextInt();
        setCoins(getCoins() + money);
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
