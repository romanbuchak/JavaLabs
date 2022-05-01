package ua.lviv.iot.tableWareStore.manager;

import lombok.Getter;
import ua.lviv.iot.tableWareStore.models.Pans;
import ua.lviv.iot.tableWareStore.models.Plates;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Manager {
    public List<Plates> sortPlatesTo12PeopleByType(List<Plates> plates, boolean inOrderOrNo) {
        if (inOrderOrNo) {
            return plates.stream()
                    .filter(plate -> plate.getNumberInBox() >= 12)
                    .sorted(Comparator.comparing(Plates::getType).reversed())
                    .collect(Collectors.toList());
        }
        return plates.stream()
                .filter(plate -> plate.getNumberInBox() >= 12)
                .sorted(Comparator.comparing(Plates::getType))
                .collect(Collectors.toList());

    }

    public List<Plates> sortPlatesTo12PeopleByPrice(List<Plates> plates, boolean inOrderOrNo) {
        if (inOrderOrNo) {
            return plates.stream()
                    .filter(plate -> plate.getNumberInBox() >= 12)
                    .sorted(Comparator.comparing(Plates::getPrice).reversed())
                    .collect(Collectors.toList());
        }
        return plates.stream()
                .filter(plate -> plate.getNumberInBox() >= 12)
                .sorted(Comparator.comparing(Plates::getPrice))
                .collect(Collectors.toList());
    }

    public List<Pans> sortPansTo12PeopleByType(List<Pans> pans, boolean inOrderOrNo) {
        if (inOrderOrNo) {
            return pans.stream()
                    .filter(pan -> pan.getNumberInBox() >= 12)
                    .sorted(Comparator.comparing(Pans::getType).reversed())
                    .collect(Collectors.toList());
        }
        return pans.stream()
                .filter(pan -> pan.getNumberInBox() >= 12)
                .sorted(Comparator.comparing(Pans::getType))
                .collect(Collectors.toList());
    }

    public List<Pans> sortPansTo12PeopleByVolume(List<Pans> pans, boolean inOrderOrNo) {
        if (inOrderOrNo) {
            return pans.stream()
                    .filter(pan -> pan.getNumberInBox() >= 12)
                    .sorted(Comparator.comparing(Pans::getVolume).reversed())
                    .collect(Collectors.toList());
        }
        return pans.stream()
                .filter(pan -> pan.getNumberInBox() >= 12)
                .sorted(Comparator.comparing(Pans::getVolume))
                .collect(Collectors.toList());
    }
}
