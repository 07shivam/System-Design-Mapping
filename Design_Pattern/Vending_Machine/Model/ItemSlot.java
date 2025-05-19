package Design_Pattern.Vending_Machine.Model;

public class ItemSlot {
    Item item;
    int quantity;

    public ItemSlot(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() { return item; }
    public int getQuantity() { return quantity; }
    public void reduceQuantity() { quantity--; }
    public void refill(int count) { quantity += count; }
}
