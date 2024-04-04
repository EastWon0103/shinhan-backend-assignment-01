package device.mobile.factory;

import device.mobile.Mobile;
import device.enums.MobileBrand;

public class MobileFactory {
    public Mobile createMobile(MobileBrand brand, String model) {
        if(brand.equals(MobileBrand.APPLE)) return createAppleMobile(model);
        if(brand.equals(MobileBrand.SAMSUNG)) return createSamsungMobile(model);

        throw new RuntimeException("해당 브랜드는 지원하지 않습니다.");
    }

    private AppleMobile createAppleMobile(String model) {
        if("13Pro".equals(model)) {
            return new AppleMobile("13Pro", 1100000);
        }

        if("14".equals(model)) {
            return new AppleMobile("14", 1200000);
        }

        if("15Pro".equals(model)) {
            return new AppleMobile("15Pro", 1250000);
        }

        throw new RuntimeException("애플에서는 존재하지 않는 모델입니다.");
    }

    private SamsungMobile createSamsungMobile(String model) {
        if("S20".equals(model)) {
            return new SamsungMobile("S20", 1000000);
        }

        if("S21".equals(model)) {
            return new SamsungMobile("S21", 1100000);
        }

        if("S22".equals(model)) {
            return new SamsungMobile("S22", 1150000);
        }

        throw new RuntimeException("삼성에서는 존재하지 않는 모델입니다.");
    }
}
