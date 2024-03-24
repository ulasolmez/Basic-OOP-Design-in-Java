
/**
 * A Bank Account class which keeps track of transactions and
 * has a balance that can be modified with deposits and withdrawals.
 * 
 * @ulasolmez
 * @24.03.2024
 */
public class BankAccount
{
    private double balance; private int transactions; private int freeTransactions;
    private double transactionFee;
    /**
     * Constructor for the class BankAccount that initializes an account with zero balance.
     * @param free the number of monthly free transactions that a customer can have
     */
    public BankAccount(int free){
        
        this.balance = 0;
        this.freeTransactions = free;
        this.transactions = 0;
        
    }
    /**
     * Another Constructor for the BankAccount class that has a certain starting balance.
     * @param startBalance the initial balance of the account
     * @param free the number of monthly free transactions that a customer can have
     */
    public BankAccount(double startBalance, int free){
        
        this.balance = startBalance;
        this.freeTransactions = free;
        this.transactions = 0;
        
    }
    /**
     * Deposits money to the balance of the account.
     * @param amount the amount of the money to be deposited
     */
    public void deposit(double amount){
        
        this.balance = this.balance + amount;
        
        this.transactions++;
        
    }
    /**
     * Withdraws money from the balance of the account.
     * @param amount the amount of money to be withdrawn
     */
    public void withdraw(double amount){
        
        this.balance = this.balance - amount;
        
        this.transactions++;
        
    }
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance(){
        
        return this.balance;
        
    }
    /**
     * Sets a transaction fee after having used the free number of transactions.
     * @param fee the transaction fee to be set
     */
    public void setTransactionFee(double fee){
        
        this.transactionFee = fee;
        
    }
    /**
     * Deducts the total transaction fee from the balance by 
     * calculating the number of paid transactions by the end of the month.
     */
    public void deductMonthlyCharge(){
        
        double totalFee = this.transactionFee * 
        (Math.max(this.transactions, this.freeTransactions) - this.freeTransactions);
        
        this.balance = this.balance - totalFee;
        
        this.transactions = 0;
        
    }
    
    
    
    
}
