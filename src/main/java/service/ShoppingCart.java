// Пакет сервиса, содержащий классы для реализации бизнес-логики
package service;

// Импорт интерфейса Discountable и класса Food из пакета модели
import model.Discountable;
import model.Food;

//Импорт константы
import static model.constants.Discount.DEFAULT_DISCOUNT;

// Класс ShoppingCart, представляющий корзину покупок
public class ShoppingCart {
    // Массив продуктов в корзине
    private final Food[] items;

    // Конструктор класса ShoppingCart, принимающий массив продуктов
    public ShoppingCart(Food[] items) {
        this.items = items; // Инициализация массива продуктов
    }

    // Метод для расчета общей суммы без учета скидок
    public double getTotalSumWithoutDiscount() {
        double sum = 0; // Инициализация суммы
        for (Food item : items) { // Перебор продуктов в корзине
            sum += item.getAmount() * item.getPrice(); // Добавление стоимости продукта к сумме
        }
        return sum; // Возвращение общей суммы
    }

    // Метод для расчета общей суммы с учетом скидок
    public double getTotalSumWithDiscount() {
        double sum = 0; // Инициализация суммы
        for (Food item : items) { // Перебор продуктов в корзине
            if (item instanceof Discountable) { // Проверка, реализует ли продукт интерфейс Discountable
                sum += item.getAmount() * item.getPrice(); // Добавление стоимости продукта без скидки к сумме

            } else {
                // Добавление стоимости продукта с учетом скидки к сумме
                sum += item.getAmount() * item.getPrice() * DEFAULT_DISCOUNT;
            }
        }
        return sum; // Возвращение общей суммы
    }

    // Метод для расчета общей суммы вегетарианских продуктов без учета скидок
    public double getTotalSumOfVegetarianProductsWithoutDiscount() {
        double sum = 0; // Инициализация суммы
        for (Food item : items) { // Перебор продуктов в корзине
            if (item.isVegetarian()) { // Проверка, является ли продукт вегетарианским
                sum += item.getAmount() * item.getPrice(); // Добавление стоимости продукта к сумме
            }
        }
        return sum; // Возвращение общей суммы
    }
}