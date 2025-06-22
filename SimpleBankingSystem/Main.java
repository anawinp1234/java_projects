package SimpleBankingSystem;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 1000.00, 2.5);
        CheckingAccount checking = new CheckingAccount("CA54321", 500.00, 200.00);

        System.out.println("Savings Account");
        savings.displayAccountInfo();
        savings.deposit(200.00);
        savings.withdraw(100.00);
        savings.addInterest();
        savings.displayAccountInfo();
        System.out.println();

        System.out.println("Checking Account");
        checking.displayAccountInfo();
        checking.deposit(300.00);
        checking.withdraw(600.00);
        checking.displayAccountInfo();
        

    }

}