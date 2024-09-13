import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new Account(accountNumber, accountHolder, initialBalance));
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
