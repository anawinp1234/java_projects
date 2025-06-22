package SimpleBankingSystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest () {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
}
