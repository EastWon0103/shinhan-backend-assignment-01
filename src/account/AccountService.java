package account;

public class AccountService {

    public static void transfer(Account fromAccount, Account toAccount, long amount) {
        long originalFromBalance = fromAccount.getBalance();
        long originalToBalance = toAccount.getBalance();

        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.printf("%d 원이 이체되었습니다.\n", amount);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            fromAccount.setBalance(originalFromBalance);
            toAccount.setBalance(originalToBalance);
        }
    }
}
