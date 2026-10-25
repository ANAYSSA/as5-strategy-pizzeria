# Assignment 5 — Strategy

A Java example for calculating a pizza price with different discounts.

## Run

```bash
javac -d out src/pizzeria/*.java
java -cp out pizzeria.Main
```

`DiscountStrategy` is the common interface. `NoDiscount` keeps the original price, `StudentDiscount` subtracts 10%, and `PickupDiscount` subtracts 20%. Prices are whole KZT amounts; the discount is rounded down to whole KZT.

`PizzaOrder` is the context. It holds a strategy and calls `applyDiscount`. `Main` switches strategies on the same order using `setDiscountStrategy`.

For a pizza costing 2500 KZT, the results are 2500, 2250 and 2000 KZT.

## Clean Code

1. Meaningful names: `StudentDiscount` and `PickupDiscount` describe the pricing rules.
2. Single responsibility: each strategy calculates one discount.
3. Polymorphism: `PizzaOrder` delegates through the interface, with no `if` or `switch` to select a discount.
4. Encapsulation: the selected strategy is private and is changed through a setter.
5. Open/Closed principle: another discount can implement `DiscountStrategy`; `PizzaOrder` and the existing strategies need no changes. The client selects the new strategy.
