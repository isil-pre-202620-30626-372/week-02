public class BankAccount {

    // Atributos de instancia
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Atributos de clase
    private static String bankName = "Banco ISIL";

    // Constructor
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double  amount) {
        balance -= amount;
    }

    public String summary() {
        return "Account: " + accountHolder;
    }
}
