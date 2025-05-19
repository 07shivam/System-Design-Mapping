package Design_Pattern.Vending_Machine.Dispense;

import java.util.List;

import Design_Pattern.Vending_Machine.Model.Coin;
import Design_Pattern.Vending_Machine.Model.Item;

public class DispenseManager {
     public void dispenseItem(Item item) {
        System.out.println("Dispensing item: " + item.getName());
    }

    public void dispenseChange(List<Coin> coins) {
        System.out.print("Dispensing change: ");
        for (Coin coin : coins) {
            System.out.print(coin + " ");
        }
        System.out.println();
    }
}
