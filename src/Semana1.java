public class Semana1 {

    public static class BankAccount {
        // atributos
        String accountNumber;
        String owner;
        double balence;

        // metodos
        void deposit(double amount) {
            balence += amount;
            System.out.println("deposito: " + amount + "|nuevo balance: " + balence);
        }

        void withdraw(double amount) {
            if (balence >= amount) {
                balence -= amount;
                System.out.println("retiro:" + amount + " ahora el balace es:" + balence);

            } else {
                System.out.println("no tiene fondos suficientes");
            }

        }

        void showBalance() {
            System.out.println(owner+" su balance es:" + balence);
        }

    }

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