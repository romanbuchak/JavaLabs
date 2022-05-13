package ua.lviv.iot.tableWareStore.manager;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    public void filterShouldWorkWithEmptyText() {
        String text = "";
        WordFilter filter = new WordFilter(List.of("a", "the"));
        String expected = "";
        String actual = filter.filterText(text);
        assertEquals(expected, actual);
    }

    @Test
    public void filterShouldPassTextWithoutChangesIfWordsNotPresent() {
        String text = "I am some text without articles";
        WordFilter filter = new WordFilter(List.of("a", "the"));
        String expected = "I am some text without articles";
        String actual = filter.filterText(text);
        assertEquals(expected, actual);
    }

    @Test
    public void filterShouldFilterOutArticlesInSimpleText() {
        String text = "I am a text. And there are some articles in the text.";
        WordFilter filter = new WordFilter(List.of("a", "the"));
        String expected = "I am text. And there are some articles in text.";
        String actual = filter.filterText(text);
        assertEquals(expected, actual);
    }

    @Test
    public void filterShouldFilterOutArticlesThatContainsUppercase() {
        String text = "I am a text. The text contains articles.";
        WordFilter filter = new WordFilter(List.of("a", "the"));
        String expected = "I am text. Text contains articles.";
        String actual = filter.filterText(text);
        assertEquals(expected, actual);
    }


}