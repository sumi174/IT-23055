class Wallet {
    private double amount;

    public void addMoney(double money) {
        if (money > 0) {
            amount += money;
        }
    }

    public double getAmount() {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.addMoney(500);
        System.out.println("Wallet balance: " + w.getAmount());
    }
}
