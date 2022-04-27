package ua.lviv.iot.tableWareStore.models;

public class Pans extends Dishes {
    double volume;
    String WithPatternOrNot;

    public Pans(String type, String color, double volume, String WithPatternOrNot) {
        super(type, color);
        this.volume = volume;
        this.WithPatternOrNot = WithPatternOrNot;
    }


    @Override
    public String toString() {
        return "On store we have " + this.type + " their color is " + this.color + " they have such a volume: " + this.volume
                + " and they have a pattern: " + this.WithPatternOrNot;
    }
}
