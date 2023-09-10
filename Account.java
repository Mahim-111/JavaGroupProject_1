class Account {
    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;

    public Account(int accountNumber, String accountHolderName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance +  amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
}
