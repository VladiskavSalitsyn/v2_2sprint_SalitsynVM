package service;
import model.Discountable;
import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalSumWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            sum += item.getAmount() * item.getPrice();
        }
        return sum;
    }

    public double getTotalSumWithDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item instanceof Discountable)
                sum += item.getAmount() * item.getPrice() * (1 - ((Discountable) item).getDiscount());
            else sum += item.getAmount() * item.getPrice();
        }
        return sum;
    }

    public double getTotalSumOfVegetarianProductsWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getAmount() * item.getPrice();
            }
        }
        return sum;
    }
}
