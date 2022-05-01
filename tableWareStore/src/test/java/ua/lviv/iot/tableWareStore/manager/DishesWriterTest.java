package ua.lviv.iot.tableWareStore.manager;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static org.junit.jupiter.api.Assertions.*;

class DishesWriterTest {

    @Test
    void writeCSV1() {
        String readerExPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\test\\resources", File.separator, "platesTest.csv");
        String readerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "platesResult.csv");
        try (BufferedReader readerEx = new BufferedReader(new FileReader(readerExPath));
             BufferedReader readerRes = new BufferedReader(new FileReader(readerResPath))) {
            assertNotEquals(readerRes.readLine(), null);
            assertNotEquals(readerEx.readLine(), null);
            assertEquals(readerEx.readLine(), readerRes.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void writeCSV() {
        String readerExPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\test\\resources", File.separator, "pansTest.csv");
        String readerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "pansResult.csv");
        try (BufferedReader readerEx = new BufferedReader(new FileReader(readerExPath));
             BufferedReader readerRes = new BufferedReader(new FileReader(readerResPath))) {
            assertNotEquals(readerRes.readLine(), null);
            assertNotEquals(readerEx.readLine(), null);
            assertEquals(readerEx.readLine(), readerRes.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}