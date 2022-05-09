package ua.lviv.iot.tableWareStore.models;

import lombok.Getter;

@Getter
public class Plates extends Dishes {
    private int price;
    private int size;

    public Plates(String type, String color, int numberInBox, int price, int size) {
        super(type, color, numberInBox);
        this.price = price; // in UAH
        this.size = size;
    }
    public String getHeaders() {
        return super.getHeaders();
    }
    public String toCSV(){
        return String.format("%s, %s, %s" , getType(), getColor(), getNumberInBox());
    }

    @Override
    public String toString() {
        return "Plates {" +
                "type:" + getType() +
                ", price = " + price +
                '}';
    }
}