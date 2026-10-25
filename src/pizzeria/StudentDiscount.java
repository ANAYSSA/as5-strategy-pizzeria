package pizzeria;

public class StudentDiscount implements DiscountStrategy {
    @Override
    public int applyDiscount(int price) {
        return price - price / 10;
    }
}
