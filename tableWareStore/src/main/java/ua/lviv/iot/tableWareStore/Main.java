package ua.lviv.iot.tableWareStore;

import ua.lviv.iot.tableWareStore.manager.DishesWriter;
import ua.lviv.iot.tableWareStore.manager.Manager;
import ua.lviv.iot.tableWareStore.models.Pans;
import ua.lviv.iot.tableWareStore.models.Plates;
import ua.lviv.iot.tableWareStore.models.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Store WoW = new Store("WoW", "Shevchenka, 34 Lviv ");

        System.out.println(WoW);
        System.out.println("\nPlates:");


        Plates deep = new Plates("deep plates", " white", 12, 110, 24);
        Plates flat = new Plates("flat plates", "black", 12, 100, 20);
        Plates bread = new Plates("bread plates", "white", 16, 50, 14);
        Plates dessert = new Plates("dessert plates", "white", 24, 67, 22);

        List<Plates> plates = new ArrayList<>();
        plates.add(deep);
        plates.add(flat);
        plates.add(bread);
        plates.add(dessert);

        List<Plates> platesListSortedByType = manager.sortPlatesTo12PeopleByType(plates, false);
        platesListSortedByType.forEach(System.out::println);

        System.out.println("\nSorted plates and pans:");

        List<Plates> platesListSortedByPrice = manager.sortPlatesTo12PeopleByPrice(plates, true);
        platesListSortedByPrice.forEach(System.out::println);

        Pans aluminium = new Pans("aluminium pans", " yellow ", 2, 5.5, " yes");
        Pans cast_iron = new Pans("cast iron pans", " green ", 6, 6, "no");
        Pans ceramic = new Pans("ceramic pans", " white ", 20, 3, "yes");

        List<Pans> pans = new ArrayList<>();
        pans.add(aluminium);
        pans.add(cast_iron);
        pans.add(ceramic);

        List<Pans> pansListSortedByType = manager.sortPansTo12PeopleByType(pans, false);
        pansListSortedByType.forEach(System.out::println);

        System.out.println("\nPans:");

        List<Pans> pansListSortedByPrice = manager.sortPansTo12PeopleByVolume(pans, true);
        pansListSortedByPrice.forEach(System.out::println);

        DishesWriter table = new DishesWriter();

        table.writeCSV1(plates);
        table.writeCSV(pans);
    }
}
