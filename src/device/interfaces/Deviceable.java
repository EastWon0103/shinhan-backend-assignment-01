package device.interfaces;

import device.enums.MobileBrand;

public interface Deviceable {
    void onBoot();
    MobileBrand getBrand();
    String getModel();
    long getPrice();
}
