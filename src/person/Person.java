package person;

import account.Account;
import device.interfaces.Deviceable;
import store.ElectronicStore;

public class Person {
    private String name;
    private Account account;
    private Deviceable device;
    private String thought;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void think(String thought) {
        if(thought == null) throw new RuntimeException("생각한 말이 꼭 있어야 설정되요.");
        this.thought = thought;
    }

    public void say() {
        if (thought == null) {
            System.out.printf("%s는 현재 할 말이 없습니다.\n", name);
            return;
        }
        System.out.printf("%s: %s\n", name, thought);
    }

    public void purchaseDevice(ElectronicStore purchaseStore, String model) {
        this.device = purchaseStore.receivePurchaseOrder(model, this.account);
        System.out.printf("%s(이)가 %s를 구매하였습니다.\n", this.name, device.getModel());
    }

    public void turnOn() {
        if (device == null) {
            System.out.printf("%s는 아직 폰이 없습니다.\n", name);
            return;
        }

        say();
        device.onBoot();
    }
}
