package Design_Pattern.Vending_Machine.Model;

public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100);
    
    int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
