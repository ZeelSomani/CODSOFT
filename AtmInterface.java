import java.util.Scanner;

class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public boolean deposit(double amount)
    {
        if (amount > 0) 
        {
            this.balance += amount;
            return true;
        } else
        {
            System.out.println("This is an invalid deposit amount.");
            return false;
        }
    }

    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= this.balance)
        {
            this.balance -= amount;
            return true;
        } else
        {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }

    public double checkBalance()
    {
        return this.balance;
    }
}
class ATM
{
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions()
    {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount)
    {
        if (this.bankAccount.withdraw(amount)) 
        {
            System.out.println("Withdrawal successful. Remaining balance: " + this.bankAccount.checkBalance());
        }
    }

    public void deposit(double amount) 
    {
        if (this.bankAccount.deposit(amount)) 
        {
            System.out.println("Deposit successful. New balance: " + this.bankAccount.checkBalance());
        }
    }

    public void checkBalance() 
    {
        System.out.println("Current balance: " + this.bankAccount.checkBalance());
    }

    public void run() 
    {
        while (true) 
        {
            displayOptions();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        double initialBalance = 0;  // Set initial balance
        BankAccount bankAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(bankAccount);
        atm.run();
    }
}
