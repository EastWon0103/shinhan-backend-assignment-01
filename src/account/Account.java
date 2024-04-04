package account;

public class Account {
    private long balance;

    public Account(long balance) {
        setBalance(balance);
    }
    public void deposit(long amount) {
        setBalance(getBalance()+amount);
    }

    public void withdraw(long amount) {
        setBalance(getBalance()-amount);
    }

    public long getBalance() {
        return this.balance;
    }
    void setBalance(long amount) {
        if (amount < 0) {
            System.out.println("계좌 잔액은 0 미만으로 설정될 수 없습니다.");
        }
    }
}
