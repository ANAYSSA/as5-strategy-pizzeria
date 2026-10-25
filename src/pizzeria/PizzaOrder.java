package pizzeria;

public class PizzaOrder {
    private DiscountStrategy discountStrategy;

    public PizzaOrder(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public int getTotal(int price) {
        return discountStrategy.applyDiscount(price);
    }
}
