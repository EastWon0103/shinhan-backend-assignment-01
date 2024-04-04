package person;

import account.Account;
import device.mobile.Mobile;

public class Person {
    private String name;
    private Account account;
    private Mobile mobile;
    private String thought;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void receiveMobile(Mobile mobile) {
        if(mobile == null) throw new RuntimeException("받는 핸드폰은 꼭 설정되어 있어야 합니다.");
        this.mobile = mobile;
    }
    public void setThought(String thought) {
        if(thought == null) throw new RuntimeException("생각한 말이 꼭 있어야 설정되요.");
        this.thought = thought;
    }

    private void say() {
        if (thought == null) {
            System.out.printf("%s는 현재 할 말이 없습니다.", name);
            return;
        }
        System.out.printf("%s: %s", name, thought);
    }

    public void turnOn() {
        if (mobile == null) {
            System.out.printf("%s는 아직 폰이 없습니다.\n", name);
            return;
        }

        say();
        mobile.onBoot();
    }
}
