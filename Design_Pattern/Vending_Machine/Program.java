package Design_Pattern.Vending_Machine;

import Design_Pattern.Vending_Machine.Model.Coin;

public class Program {

 public static void main(String[] args) {
    
        VendingMachine machine = new VendingMachine();

        machine.insertCoin(Coin.DOLLAR);
        machine.insertCoin(Coin.QUARTER);
        machine.selectItem(101);
        machine.dispense();
    }

}