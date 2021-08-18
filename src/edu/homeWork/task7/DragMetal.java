package edu.homeWork.task7;

public class DragMetal {
    
    private int price; // Никогда не оставляй прямой доступ к полям pojo / beans классам. На это дело есть геттеры /сеттеры.
    private int amount;
    private String name;
    private int id; // Если мы знаем, что поле не изменится - добавляем модификатор final.

    public DragMetal(int price, int amount, String name) {
        this.price = price;
        this.amount = amount;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) { // Если поле требуется мутабельное.
        this.price = price;
    }
    
    ...
    
    public int getId() {
        return 0;
    }
    
    // Мы ложим данный класс в ArrayList. В таких классах обязательна реализация hashCode и equals методов для сравнения и уникальности объектов в листе.
}
