package ua.lviv.iot.tableWareStore;

import ua.lviv.iot.tableWareStore.manager.DishesWriter;
import ua.lviv.iot.tableWareStore.manager.Manager;
import ua.lviv.iot.tableWareStore.manager.WordFilter;
import ua.lviv.iot.tableWareStore.models.*;

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

        String text = " Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, and what is the use of a book, thought Alice, without pictures or conversations? So she was considering in her own mind (as well as she could, for the hot day made her feel very sleepy and stupid) whether the pleasure of making a daisy-chain would be worth the trouble of getting up and picking the daisies, when suddenly a White Rabbit with pink eyes ran close by her. ";
        WordFilter filter = new WordFilter();
        String filtered = filter.filterText(text);
        System.out.println(filtered);
    }

}
