package Design_Pattern.Vending_Machine;

import Design_Pattern.Vending_Machine.Dispense.DispenseManager;
import Design_Pattern.Vending_Machine.Interface.IVendingState;
import Design_Pattern.Vending_Machine.Inventory.Inventory;
import Design_Pattern.Vending_Machine.Model.Coin;
import Design_Pattern.Vending_Machine.Model.Item;
import Design_Pattern.Vending_Machine.Payment.PaymentProcessor;
import Design_Pattern.Vending_Machine.State.IdleState;

public class VendingMachine {
    private final Inventory inventory;
    private final PaymentProcessor paymentProcessor;
    private final DispenseManager dispenseManager;
    private IVendingState currentState;
    private Item selectedItem;

    public VendingMachine() {
        this.inventory = new Inventory();
        this.paymentProcessor = new PaymentProcessor();
        this.dispenseManager = new DispenseManager();
        this.currentState = new IdleState();
    }

    public void insertCoin(Coin coin) {
        currentState.insertCoin(this, coin);
        //currentState.insertCoin(this, coin);

    }

    public void selectItem(int code) {
        currentState.selectItem(this, code);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void cancelTransaction() {
        currentState.cancel(this);
    }

    public Inventory getInventory() { return inventory; }
    public PaymentProcessor getPaymentProcessor() { return paymentProcessor; }
    public DispenseManager getDispenseManager() { return dispenseManager; }
    public void setCurrentState(IVendingState state) { this.currentState = state; }
    public void setSelectedItem(Item item) { this.selectedItem = item; }
    public Item getSelectedItem() { return selectedItem; }
}