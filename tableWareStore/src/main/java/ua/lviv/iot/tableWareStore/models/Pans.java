package ua.lviv.iot.tableWareStore.models;

import lombok.Getter;

@Getter
public class Pans extends Dishes {
    private double volume;
    private String WithPatternOrNot;

    public Pans(String type, String color, int numberInBox, double volume, String WithPatternOrNot) {
        super(type, color, numberInBox);
        this.volume = volume;
        this.WithPatternOrNot = WithPatternOrNot;
    }
    public String getHeaders() {
        return super.getHeaders();
    }
    public String toCSV(){
        return String.format("%s, %s, %s" , getType(), getColor(), getNumberInBox()) ;
    }

    @Override
    public String toString() {
        return "Pans {" +
                "type: " + getType() +
                ", volume = '" + volume + '\'' +
                '}';
    }
}

