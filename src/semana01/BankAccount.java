package semana01;


    public  class BankAccount {
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
