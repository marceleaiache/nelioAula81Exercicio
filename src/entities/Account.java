package entities;

public class Account {

    //ATRIBUTOS DO OBJETO
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    //MÉTODOS GETTERS AND SETTERS
    public String getHolder() {

        return holder;
    }

    public void setHolder(String holder) {

        this.holder = holder;
    }

    public double getBalance() {

        return balance;
    }

    public int getNumber() {

        return number;
    }

    //MÉTODOS DO OBJETO
    public void deposit(double amount) {

        balance += amount;

    }

    public void withdraw(double amount) {

        balance -= amount + 5;

    }

    //MÉTODO TOSTRING
    public String toString() {
        return "Account "
                        + "holder='" + holder + '\'' +
                        + number
                        + "Holder: "
                        + holder
                        + ", Balance: $ "
                        + String.format("%.2f", balance);
    }
}
