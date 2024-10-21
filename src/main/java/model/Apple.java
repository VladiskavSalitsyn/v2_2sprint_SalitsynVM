// Пакет модели, содержащий классы для представления различных продуктов
package model;

// Импортирование статических констант для использования в классе
import static model.constants.Colour.RED;
import static model.constants.Discount.DEFAULT_DISCOUNT;

// Определение класса Apple, который наследует от класса Food и реализует интерфейс Discountable
public class Apple extends Food implements Discountable {

    // Поле для хранения цвета яблока
    private final String colour;

    // Конструктор класса Apple, принимающий количество, цену и цвет яблока
    public Apple(int amount, double price, String colour) {
        // Вызов конструктора родительского класса Food с параметрами amount, price и true
        super(amount, price, true);
        // Инициализация поля цвета
        this.colour = colour;
    }

    // Переопределение метода getDiscount для определения скидки на яблоко
    @Override
    public double getDiscount() {
        // Если цвет яблока красный, возвращаем стандартную скидку
        if (colour.equals(RED)) {
            return DEFAULT_DISCOUNT;
        } else {
            // В противном случае возвращаем 0 (без скидки)
            return 0;
        }
    }
}