package ua.lviv.iot.tableWareStore.models;

import lombok.Getter;

@Getter
public abstract class Dishes {
    private int numberInBox;
    private String type;
    private String color;

    public Dishes(String type, String color, int numberInBox) {
        this.type = type;
        this.color = color;
        this.numberInBox = numberInBox;

    }

    @Override
    public String toString() {
        return "Dishes{" +
                "numberInBox=" + numberInBox +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}