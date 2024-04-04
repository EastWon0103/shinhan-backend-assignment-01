import account.Account;
import device.enums.MobileBrand;
import device.mobile.factory.MobileFactory;
import person.Person;
import store.ElectronicStore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 일단 성공 시나리오
        try {
            // 공장 생성
            MobileFactory mobileFactory = new MobileFactory();

            // 상점 생성
            ElectronicStore electronicStore = new ElectronicStore(new Account(100000000));

            // 생성 및 재고 입고
            electronicStore.addDevices(Arrays.asList(
                mobileFactory.createMobile(MobileBrand.APPLE, "13Pro"),
                mobileFactory.createMobile(MobileBrand.APPLE, "14"),
                mobileFactory.createMobile(MobileBrand.SAMSUNG, "S20")
            ));

            // 쏘니와 베컴
            Person sonny = new Person("쏘니", new Account(100000000));
            Person beckham = new Person("베컴", new Account(100000000));

            // 쏘니는 S20(삼성폰)을, 베컴은 13Pro(애플폰)을 삼
            sonny.purchaseDevice(electronicStore, "S20");
            beckham.purchaseDevice(electronicStore, "13Pro");

            // 쏘니가 켜야겠다는 생각을 하고 말함, 그리고 폰을 킴
            sonny.think("내가 폰을 켜볼게");
            sonny.turnOn();

            beckham.think("I'll turn on my device too.");
            beckham.turnOn();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
