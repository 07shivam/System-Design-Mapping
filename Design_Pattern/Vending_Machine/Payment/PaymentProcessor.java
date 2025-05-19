package Design_Pattern.Vending_Machine.Payment;

import java.util.ArrayList;
import java.util.List;

import Design_Pattern.Vending_Machine.Model.Coin;

public class PaymentProcessor {
    List<Coin> insertedCoins = new ArrayList<>();

    public void insertCoin(Coin coin) {
        insertedCoins.add(coin);
    }

    public int getInsertedAmount() {
        return insertedCoins.stream().mapToInt(Coin::getValue).sum();
    }

    public boolean isAmountSufficient(int price) {
        return getInsertedAmount() >= price;
    }

    public List<Coin> getChange(int price) {
        int change = getInsertedAmount() - price;
        List<Coin> changeList = new ArrayList<>();
        for (Coin coin : Coin.values()) {
            while (change >= coin.getValue()) {
                changeList.add(coin);
                change -= coin.getValue();
            }
        }
        return changeList;
    }

    public void reset() {
        insertedCoins.clear();
    }
}
