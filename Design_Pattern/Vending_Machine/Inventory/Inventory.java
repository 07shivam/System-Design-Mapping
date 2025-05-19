package Design_Pattern.Vending_Machine.Inventory;

import java.util.HashMap;
import java.util.Map;

import Design_Pattern.Vending_Machine.Model.Item;
import Design_Pattern.Vending_Machine.Model.ItemSlot;

public class Inventory {
    Map<Integer, ItemSlot> slots = new HashMap<>();

    public Inventory() {
        // preload with sample items
        addNewItem(new Item(101, "Chips", 125), 10);
        addNewItem(new Item(102, "Soda", 150), 10);
    }

    public void addNewItem(Item item, int quantity) {
        slots.put(item.getCode(), new ItemSlot(item, quantity));
    }

    public Item getItem(int code) {
        return slots.get(code).getItem();
    }

    public boolean isAvailable(int code) {
        return slots.containsKey(code) && slots.get(code).getQuantity() > 0;
    }

    public void reduceQuantity(int code) {
        slots.get(code).reduceQuantity();
    }

    public void refillItem(int code, int quantity) {
        slots.get(code).refill(quantity);
    }
}
