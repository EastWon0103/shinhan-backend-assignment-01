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
            fromAccount.setBalance(originalFromBalance);
            toAccount.setBalance(originalToBalance);
            throw new IllegalArgumentException("계좌 잔액 부족으로 이체가 불가능합니다.\"");
        }
    }
}
