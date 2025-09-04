package semana01;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "555-555-555";
        account1.balence = 2000000;
        account1.owner = "andres";
        
        account1.showBalance();
        account1.deposit(200000);
        account1.withdraw(1000000);
    }
}
