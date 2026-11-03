class Bank {

    double deposit(double balance, double amount) {
        return balance + amount;
    }

    double withdraw(double balance, double amount) {

        if (balance >= amount)
            return balance - amount;
        else {
            System.out.println("Insufficient Balance!");
            return balance;
        }
    }

    void checkBalance(double balance) {
        System.out.println("Current Balance: " + balance);
    }

    void displayTransactionSummary(double deposit, double withdraw, double balance) {
        System.out.println("Deposited: " + deposit);
        System.out.println("Withdrawn: " + withdraw);
        System.out.println("Final Balance: " + balance);
    }
}

public class BankingOperations {

    public static void main(String[] args) {

        Bank b = new Bank();

        double initialBalance = 5000;

        System.out.println("Initial Balance: " + initialBalance);

        double afterDeposit = b.deposit(initialBalance, 2000);
        double afterWithdraw = b.withdraw(afterDeposit, 1500);

        b.checkBalance(afterWithdraw);

        b.displayTransactionSummary(2000, 1500, afterWithdraw);
    }
}