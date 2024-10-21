// Пакет модели, содержащий классы и интерфейсы для представления различных продуктов
package model;

// Абстрактный класс Food, представляющий общие характеристики продуктов
public abstract class Food {

    // Поле для хранения количества продуктов в килограммах
    protected int amount;
    // Поле для хранения цены за единицу товара
    protected double price;
    // Поле для обозначения, является ли продукт вегетарианским
    protected boolean isVegetarian;

    // Конструктор класса Food, принимающий количество, цену и информацию о вегетарианстве
    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount; // Инициализация поля amount
        this.price = price; // Инициализация поля price
        this.isVegetarian = isVegetarian; // Инициализация поля isVegetarian
    }

    // Метод для получения количества продуктов
    public int getAmount() {
        return amount; // Возвращает количество
    }

    // Метод для получения цены за единицу товара
    public double getPrice() {
        return price; // Возвращает цену
    }

    // Метод для проверки, является ли продукт вегетарианским
    public boolean isVegetarian() {
        return isVegetarian; // Возвращает true, если продукт вегетарианский
    }
}