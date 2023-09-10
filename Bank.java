import java.util.ArrayList;

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(int accountNumber, String accountHolderName, String accountType, double initialDeposit) {
        Account newAccount = new Account(accountNumber, accountHolderName, accountType, initialDeposit);
        accounts.add(newAccount);
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}