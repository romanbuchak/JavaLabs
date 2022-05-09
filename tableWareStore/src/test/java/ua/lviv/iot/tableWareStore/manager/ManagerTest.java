package ua.lviv.iot.tableWareStore.manager;

import ua.lviv.iot.tableWareStore.models.Pans;
import ua.lviv.iot.tableWareStore.models.Plates;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    List<Plates> plates = new ArrayList<>();
    Plates deep = new Plates("deep plates,", " white", 12, 110, 24);
    Plates flat = new Plates("flat plates", "black", 12, 100, 20);
    Plates bread = new Plates("bread plates", "white", 16, 50, 14);
    Plates dessert = new Plates("dessert plates", "white", 24, 67, 22);

    List<Pans> pans = new ArrayList<>();
    Pans aluminium = new Pans("aluminium pans,", " yellow,", 2, 5.5, " yes");
    Pans castIron = new Pans("cast iron pans,", " green,", 6, 6, "no");
    Pans ceramic = new Pans("ceramic pans", " white,", 20, 3, "yes");



    @org.junit.jupiter.api.Test
    void sortPlatesTo12PeopleByTypeInAnc() {
        Manager manager = new Manager();

        List<Plates> actualPlatesSortByType = manager.sortPlatesTo12PeopleByType(plates, false);
        List<Plates> expectedPlatesSortByType = new ArrayList<>();
        Plates bread = new Plates("bread plates", "white", 16, 50, 14);
        Plates dessert = new Plates("dessert plates", "white", 24, 67, 22);

        assertThat(actualPlatesSortByType, is(expectedPlatesSortByType));
    }
    @org.junit.jupiter.api.Test
    void sortPlatesTo12PeopleByTypeInDesc() {
        Manager manager = new Manager();

        List<Plates> actualPlatesSortByType = manager.sortPlatesTo12PeopleByType(plates, true);
        List<Plates> expectedPlatesSortByType = new ArrayList<>();
        Plates bread = new Plates("bread plates", "white", 16, 50, 14);
        Plates dessert = new Plates("dessert plates", "white", 24, 67, 22);

        assertThat(actualPlatesSortByType, is(expectedPlatesSortByType));
    }

    @org.junit.jupiter.api.Test
    void sortPlatesTo12PeopleByPriceInAnc1() {
        Manager manager = new Manager();

        List<Plates> actualPlatesSortByPrice = manager.sortPlatesTo12PeopleByType(plates, false);
        List<Plates> expectedPlatesSortByPrice = new ArrayList<>();
        Plates dessert = new Plates("dessert plates", "white", 24, 67, 22);
        Plates bread = new Plates("bread plates", "white", 16, 50, 14);

        assertThat(actualPlatesSortByPrice, is(expectedPlatesSortByPrice));
    }
    @org.junit.jupiter.api.Test
    void sortPlatesTo12PeopleByPriceInDesc1() {
        Manager manager = new Manager();

        List<Plates> actualPlatesSortByPrice = manager.sortPlatesTo12PeopleByType(plates, true);
        List<Plates> expectedPlatesSortByPrice = new ArrayList<>();
        Plates bread = new Plates("bread plates", "white", 16, 50, 14);
        Plates dessert = new Plates("dessert plates", "white", 24, 67, 22);

        assertThat(actualPlatesSortByPrice, is(expectedPlatesSortByPrice));
    }
    @org.junit.jupiter.api.Test
    void sortPansTo12PeopleByTypeInAnc2() {
        Manager manager = new Manager();

        List<Pans> actualPansSortByType = manager.sortPansTo12PeopleByType(pans, false);
        List<Pans> expectedPansSortByType = new ArrayList<>();
        Pans aluminium = new Pans("aluminium pans,", " yellow,", 2, 5.5, " yes");
        Pans castIron = new Pans("cast iron pans,", " green,", 6, 6, "no");

        assertThat(actualPansSortByType, is(expectedPansSortByType));

    }
    @org.junit.jupiter.api.Test
    void sortPansTo12PeopleByTypeInDesc2() {
        Manager manager = new Manager();

        List<Pans> actualPansSortByType = manager.sortPansTo12PeopleByType(pans, true);
        List<Pans> expectedPansSortByType = new ArrayList<>();
        Pans aluminium = new Pans("aluminium pans,", " yellow,", 2, 5.5, " yes");
        Pans castIron = new Pans("cast iron pans,", " green,", 6, 6, "no");

        assertThat(actualPansSortByType, is(expectedPansSortByType));
    }

    @org.junit.jupiter.api.Test
    void sortPansTo12PeopleByVolumeInAnc3() {
        Manager manager = new Manager();

        List<Pans> actualPansSortByVolume = manager.sortPansTo12PeopleByVolume(pans, false);
        List<Pans> expectedPansSortByVolume = new ArrayList<>();
        Pans castIron = new Pans("cast iron pans,", " green,", 6, 6, "no");
        Pans aluminium = new Pans("aluminium pans,", " yellow,", 2, 5.5, " yes");

        assertThat(actualPansSortByVolume, is(expectedPansSortByVolume));
    }
    @org.junit.jupiter.api.Test
    void sortPansTo12PeopleByVolumeInDesc3() {
        Manager manager = new Manager();

        List<Pans> actualPansSortByVolume = manager.sortPansTo12PeopleByVolume(pans, true);
        List<Pans> expectedPansSortByVolume = new ArrayList<>();
        Pans castIron = new Pans("cast iron pans,", " green,", 6, 6, "no");
        Pans aluminium = new Pans("aluminium pans,", " yellow,", 2, 5.5, " yes");

        assertThat(actualPansSortByVolume, is(expectedPansSortByVolume));
    }
}