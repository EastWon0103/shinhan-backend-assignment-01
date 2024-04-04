import account.Account;
import device.enums.MobileBrand;
import device.mobile.factory.MobileFactory;
import person.Person;
import store.ElectronicStore;

import java.util.Arrays;

public class Main {
    /*
     * Q: 사람이 상점에서 핸드폰을 구매합니다.
     * 쏘니가 삼성핸드폰을 샀습니다.
     * 베컴은 애플핸드폰을 샀습니다.
     * 쏘니가 핸드폰을 켰습니다. -> "야 내 핸드폰 켜볼게" 사람이 오침 -> "삐비빅" (핸드폰이 내는 소리)
     * 베컴도 핸드폰을 켰습니다. -> "turn on" => 'bbeep"(핸드폰을 내는 소리)
     * */
    public static void main(String[] args) {
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


        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
