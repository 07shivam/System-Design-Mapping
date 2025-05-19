package Design_Pattern.Vending_Machine.Interface;

import Design_Pattern.Vending_Machine.VendingMachine;
import Design_Pattern.Vending_Machine.Model.Coin;

public interface IVendingState {

    void insertCoin(VendingMachine machine, Coin coin);
    void selectItem(VendingMachine machine, int code);
    void dispense(VendingMachine machine);
    void cancel(VendingMachine machine);

}
