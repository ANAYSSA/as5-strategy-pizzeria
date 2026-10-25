package pizzeria;

public class Main {
    public static void main(String[] args) {
        int pizzaPrice = 2500;
        PizzaOrder order = new PizzaOrder(new NoDiscount());
        System.out.println("Regular price: " + order.getTotal(pizzaPrice) + " KZT");

        order.setDiscountStrategy(new StudentDiscount());
        System.out.println("Student price: " + order.getTotal(pizzaPrice) + " KZT");

        order.setDiscountStrategy(new PickupDiscount());
        System.out.println("Pickup price: " + order.getTotal(pizzaPrice) + " KZT");
    }
}
