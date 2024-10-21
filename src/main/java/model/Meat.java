// Пакет модели, содержащий классы и интерфейсы для представления различных продуктов
package model;

// Класс Meat, наследующий от класса Food и представляющий мясные продукты
public class Meat extends Food {

    // Конструктор класса Meat, принимающий количество и цену
    public Meat(int amount, double price) {
        // Вызов конструктора родительского класса Food с параметрами amount, price и false (поскольку мясо не является вегетарианским)
        super(amount, price, false);
    }

}