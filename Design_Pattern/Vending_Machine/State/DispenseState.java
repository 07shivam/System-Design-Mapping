package Design_Pattern.Vending_Machine.State;

import Design_Pattern.Vending_Machine.Interface.IVendingState;
import Design_Pattern.Vending_Machine.Model.Coin;
import Design_Pattern.Vending_Machine.Model.Item;
import Design_Pattern.Vending_Machine.VendingMachine;

public class DispenseState implements IVendingState {
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Please wait, dispensing in progress");
    }

    public void selectItem(VendingMachine machine, int code) {
        System.out.println("Already selected, dispensing in progress");
    }

    public void dispense(VendingMachine machine) {
        Item item = machine.getSelectedItem();
        machine.getInventory().reduceQuantity(item.getCode());
        machine.getDispenseManager().dispenseItem(item);
        machine.getDispenseManager().dispenseChange(
            machine.getPaymentProcessor().getChange(item.getPrice()));
        machine.getPaymentProcessor().reset();
        machine.setSelectedItem(null);
        machine.setCurrentState(new IdleState());
    }

    public void cancel(VendingMachine machine) {
        System.out.println("Cannot cancel, dispensing in progress");
    }
}
