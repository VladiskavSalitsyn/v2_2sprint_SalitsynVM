import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.util.Arrays;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        // Initialize data
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        // Calculate and print results
        String noDiscount = " без скидки: ";
        String discount = " со скидкой: ";
        String veganProducts = " вегетарианских продуктов ";

        String totalAmountWithoutDiscount = format("Общая сумма %s", noDiscount);
        String totalAmountDiscounted = format("Общая сумма %s", discount);
        String TotalAmountOfVeganProductsWithoutDiscount = format("Общая сумма %s", veganProducts, noDiscount);

        System.out.printf("%s%s%n", totalAmountWithoutDiscount, cart.getTotalSumWithoutDiscount());
        for (String s : Arrays.asList(format("%s%s", totalAmountDiscounted, cart.getTotalSumWithDiscount()),
                format("%s%s", TotalAmountOfVeganProductsWithoutDiscount,
                        cart.getTotalSumOfVegetarianProductsWithoutDiscount()))) {
            System.out.println(s);
        }
    }
}