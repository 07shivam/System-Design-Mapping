package Design_Pattern.Vending_Machine.State;

import Design_Pattern.Vending_Machine.Interface.IVendingState;
import Design_Pattern.Vending_Machine.Model.Coin;
import Design_Pattern.Vending_Machine.VendingMachine;

public class IdleState implements IVendingState {
    public void insertCoin(VendingMachine machine, Coin coin) {
        machine.getPaymentProcessor().insertCoin(coin);
        machine.setCurrentState(new HasMoneyState());
    }

    public void selectItem(VendingMachine machine, int code) {
        System.out.println("Insert coin first");
    }

    public void dispense(VendingMachine machine) {
        System.out.println("Insert coin and select item first");
    }

    public void cancel(VendingMachine machine) {
        System.out.println("Nothing to cancel");
    }
}
