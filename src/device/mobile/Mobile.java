package device.mobile;

import device.enums.MobileBrand;
import device.interfaces.Deviceable;

public abstract class Mobile implements Deviceable {
    protected MobileBrand brand;
    protected String model;
    protected String vibrationSound;
    protected long price;

    public Mobile(MobileBrand brand, String model, String vibrationSound, long price) {
        this.brand = brand;
        this.model = model;
        this.vibrationSound = vibrationSound;
        this.price = price;
    }


    @Override
    public MobileBrand getBrand() {
        return brand;
    }

    @Override
    public void onBoot() {
        System.out.printf("\"%s\", %s(이)가 켜졌습니다.\n",vibrationSound, model);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public long getPrice() {
        return price;
    }
}
