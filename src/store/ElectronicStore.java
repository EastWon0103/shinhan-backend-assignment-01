package store;

import account.Account;
import account.AccountService;
import device.interfaces.Deviceable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ElectronicStore {
    private final List<Deviceable> inventory = new ArrayList<>();
    private final Account account;

    public ElectronicStore(Account account) {
        this.account = account;
    }

    public void addDevices(List<Deviceable> devices) {
        inventory.addAll(devices);
    }

    public Deviceable receivePurchaseOrder(String model, Account orderAccount) {
        Deviceable device = findByModel(model).orElseThrow(() -> new RuntimeException("해당 모델은 저희 매장에 없습니다."));

        AccountService.transfer(orderAccount, this.account ,device.getPrice());

        removeDeviceAtInventory(device);
        return device;
    }

    private Optional<Deviceable> findByModel(String model) {
        for(Deviceable device: inventory) {
            if(device.getModel().equals(model)) return Optional.of(device);
        }
        return Optional.empty();
    }

    private void removeDeviceAtInventory(Deviceable device) {
        inventory.remove(device);
    }

    public boolean isInInventory(String model) {
        for(Deviceable device: inventory) {
            if(device.getModel().equals(model)) return true;
        }

        return false;
    }
}
