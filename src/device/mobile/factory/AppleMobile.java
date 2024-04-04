package device.mobile.factory;

import device.mobile.Mobile;
import device.enums.MobileBrand;

public class AppleMobile extends Mobile {
    AppleMobile(String model, long price) {
        super(MobileBrand.APPLE, model, "beep", price);
    }
}
