package ua.lviv.iot.tableWareStore.models;
public class Plates extends Dishes {
    int price;
    int size;

    public Plates(String type, String color, int price, int size) {
        super(type, color);
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "On store we have " + this.type + " their color is " + this.color + " and they cost " + this.price +
                " and have such a size: " + this.size;
    }
}