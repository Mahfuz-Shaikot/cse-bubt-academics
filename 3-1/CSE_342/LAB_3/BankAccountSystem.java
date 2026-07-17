
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = Objects.requireNonNull(accountNumber, "Account number cannot be null.").trim();
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }
        if (amount > this.balance) {
            throw new IllegalStateException("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public void displayAccountInfo() {
        System.out.printf("Account No: %s | Balance: $%.2f%n", accountNumber, balance);
    }
}

class Customer {

    private final String name;
    private final String customerId;
    private final List<BankAccount> accounts;

    public Customer(String name, String customerId) {
        this.name = Objects.requireNonNull(name, "Customer name cannot be null.").trim();
        this.customerId = Objects.requireNonNull(customerId, "Customer ID cannot be null.").trim();
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<BankAccount> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    public void addAccount(BankAccount account) {
        Objects.requireNonNull(account, "Cannot link a null bank account.");
        if (accounts.stream().anyMatch(acc -> acc.getAccountNumber().equalsIgnoreCase(account.getAccountNumber()))) {
            throw new IllegalArgumentException("Account number already linked to this customer.");
        }
        accounts.add(account);
    }

    public void deposit(String accountNumber, double amount) {
        findAccountOrThrow(accountNumber).deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        findAccountOrThrow(accountNumber).withdraw(amount);
    }

    private BankAccount findAccountOrThrow(String accountNumber) {
        return accounts.stream()
                .filter(acc -> acc.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Account not found: " + accountNumber));
    }

    public void displayCustomerProfile() {
        System.out.printf("Customer: %s (ID: %s)%n", name, customerId);
        if (accounts.isEmpty()) {
            System.out.println("  No active bank accounts linked.");
        } else {
            accounts.forEach(BankAccount::displayAccountInfo);
        }
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {
        try {
            Customer customer = new Customer("Mahfuz Shaikot", "CUS-7792");
            customer.addAccount(new BankAccount("ACC-101", 1500.00));
            customer.addAccount(new BankAccount("ACC-102", 350.50));

            customer.displayCustomerProfile();

            customer.deposit("ACC-101", 500.00);
            customer.withdraw("ACC-102", 150.00);

            customer.displayCustomerProfile();
            customer.withdraw("ACC-102", 500.00);

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
        }
    }
}
