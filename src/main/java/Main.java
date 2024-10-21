import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        // Initialize data
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        // Описание типов сумм
        String noDiscountLabel = " без скидки: ";
        String discountLabel = " со скидкой: ";
        String veganProductsLabel = " вегетарианских продуктов ";

        // Форматирование строк с общей суммой
        String totalAmountWithoutDiscountMessage = String.format("Общая сумма%s", noDiscountLabel);
        String totalAmountDiscountedMessage = String.format("Общая сумма%s", discountLabel);
        String totalAmountOfVeganProductsMessage = String.format("Общая сумма%s", veganProductsLabel);

        // Печать общей суммы без скидки
        System.out.printf("%s%s%n", totalAmountWithoutDiscountMessage, cart.getTotalSumWithoutDiscount());

        // Создание списка сообщений для вывода
        List<String> discountMessages = Arrays.asList(
                String.format("%s%s", totalAmountDiscountedMessage, cart.getTotalSumWithDiscount()),
                String.format("%s%s", totalAmountOfVeganProductsMessage, cart.getTotalSumOfVegetarianProductsWithoutDiscount())
        );

        // Печать сообщений со скидками
        for (String message : discountMessages) {
            System.out.println(message);
        }
    }
}