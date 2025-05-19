package Design_Pattern.Vending_Machine.State;

import Design_Pattern.Vending_Machine.Interface.IVendingState;
import Design_Pattern.Vending_Machine.Model.Coin;
import Design_Pattern.Vending_Machine.Model.Item;
import Design_Pattern.Vending_Machine.VendingMachine;

public class HasMoneyState implements IVendingState {
    public void insertCoin(VendingMachine machine, Coin coin) {
        machine.getPaymentProcessor().insertCoin(coin);
    }

    public void selectItem(VendingMachine machine, int code) {
        if (!machine.getInventory().isAvailable(code)) {
            System.out.println("Item not available");
            return;
        }
        Item item = machine.getInventory().getItem(code);
        if (!machine.getPaymentProcessor().isAmountSufficient(item.getPrice())) {
            System.out.println("Insufficient funds");
            return;
        }
        machine.setSelectedItem(item);
        machine.setCurrentState(new DispenseState());
    }

    public void dispense(VendingMachine machine) {
        System.out.println("Select item first");
    }

    public void cancel(VendingMachine machine) {
        machine.getPaymentProcessor().reset();
        machine.setCurrentState(new IdleState());
        System.out.println("Transaction cancelled");
    }
}