// Импорт необходимых классов и интерфейсов из пакетов model и service
import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

// Главный класс приложения
public class Main {
    // Точка входа в программу
    public static void main(String[] args) {
        // Инициализация данных

        // Создание объекта Meat с количеством и ценой
        Meat meat = new Meat(5, 100);
        // Создание объекта Apple (красное) с количеством и ценой
        Apple redApple = new Apple(10, 50, Colour.RED);
        // Создание объекта Apple (зеленое) с количеством 8 и ценой 60
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Создание массива продуктов для корзины

        // Массив, содержащий мясо и яблоки
        Food[] items = {meat, redApple, greenApple};
        // Создание объекта ShoppingCart с массивом продуктов
        ShoppingCart cart = new ShoppingCart(items);

        // Описание типов сумм
        String noDiscountLabel = " без скидки: "; // Метка для суммы без скидки
        String discountLabel = " со скидкой: "; // Метка для суммы со скидкой
        String veganProductsLabel = " вегетарианских продуктов "; // Метка для вегетарианских продуктов

        // Форматирование строк с общей суммой

        // Форматирование строки для суммы без скидки
        String totalAmountWithoutDiscountMessage = String.format("Общая сумма%s", noDiscountLabel);
        // Форматирование строки для суммы со скидкой
        String totalAmountDiscountedMessage = String.format("Общая сумма%s", discountLabel);
        // Форматирование строки для суммы вегетарианских продуктов
        String totalAmountOfVeganProductsMessage = String.format("Общая сумма%s", veganProductsLabel);

        // Печать общей суммы без скидки
        System.out.printf("%s%s%n", totalAmountWithoutDiscountMessage, cart.getTotalSumWithoutDiscount());

        // Создание списка сообщений для вывода
        List<String> discountMessages = Arrays.asList(
                // Сообщение о сумме со скидкой
                String.format("%s%s", totalAmountDiscountedMessage, cart.getTotalSumWithDiscount()),
                // Сообщение о сумме вегетарианских продуктов
                String.format("%s%s", totalAmountOfVeganProductsMessage, cart.getTotalSumOfVegetarianProductsWithoutDiscount())
        );

        // Печать сообщений со скидками
        for (String message : discountMessages) {
            // Вывод каждого сообщения
            System.out.println(message);
        }
    }
}