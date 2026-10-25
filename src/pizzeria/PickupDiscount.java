package pizzeria;

public class PickupDiscount implements DiscountStrategy {
    @Override
    public int applyDiscount(int price) {
        return price - price / 5;
    }
}
