package pizzeria;

public class NoDiscount implements DiscountStrategy {
    @Override
    public int applyDiscount(int price) {
        return price;
    }
}
