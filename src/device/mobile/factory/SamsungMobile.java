package device.mobile.factory;

import device.mobile.Mobile;
import device.enums.MobileBrand;

public class SamsungMobile extends Mobile {
    SamsungMobile(String model, long price) {
        super(MobileBrand.SAMSUNG, model, "띠리링", price);
    }
}
