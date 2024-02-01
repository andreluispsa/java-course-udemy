package orientacaoObjetoConta.entities;

public class Account {

    private final int number;
    private String holderName;
    private double balance;

    public Account(int number, String holderName, double initialDeposit) {
        this.number = number;
        this.holderName = holderName;
        deposit(initialDeposit);
    }

    public Account(int number, String holderName) {
        this.number = number;
        this.holderName = holderName;
    }

    public int getNumber() {
        return number;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double value) {
        this.balance -= value + 5.0;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public String toString() {
        return "Account " + getNumber()
                + ", Holder: " + getHolderName()
                + ", Balance: $" + String.format("%.2f%n", getBalance());
    }
}
