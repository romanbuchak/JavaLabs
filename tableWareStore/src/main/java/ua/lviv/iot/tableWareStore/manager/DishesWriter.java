package ua.lviv.iot.tableWareStore.manager;

import ua.lviv.iot.tableWareStore.models.Pans;
import ua.lviv.iot.tableWareStore.models.Plates;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class DishesWriter {

    public void writeCSV1(List<Plates> plates) {
        String writerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "tableWareStore\\src\\main\\resources", File.separator, "platesResult.csv");
        try (FileWriter writer = new FileWriter(writerResPath)) {
            String lastClassName = "";
            for (var plate : plates) {
                if (!plates.getClass().getSimpleName().equals(lastClassName)) {
                    writer.write(plate.getHeaders());
                    writer.write("\n");
                    lastClassName = plates.getClass().getSimpleName();
                }
                writer.write(plate.toCSV());
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeCSV(List<Pans> pans) {
        String writerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "tableWareStore\\src\\main\\resources", File.separator, "pansResult.csv");
        try (FileWriter writer = new FileWriter(writerResPath)) {
            String lastClassName = "";
            for (var pan : pans) {
                if (!pans.getClass().getSimpleName().equals(lastClassName)) {
                    writer.write(pan.getHeaders());
                    writer.write("\n");
                    lastClassName = pans.getClass().getSimpleName();
                }
                writer.write(pan.toCSV());
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

