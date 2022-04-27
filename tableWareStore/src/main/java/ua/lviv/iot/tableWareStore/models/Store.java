package ua.lviv.iot.tableWareStore.models;

public class Store {
    String name;
    String location;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "The name of store is " + this.name + ", and they located on " + this.location;
    }
}