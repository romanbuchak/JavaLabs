package ua.lviv.iot.tableWareStore.manager;

import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {
    private String PUNCTUATION_REGEX = "[,.?!]";
    private String ONLY_LETTERS_REGEX = "[a-zA-Z]";
    public List<String> wordsToExclude;

    public WordFilter(List<String> wordsToExclude) {
        this.wordsToExclude = wordsToExclude.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public WordFilter() {
        this(List.of("a", "the", "or", "are", "on", "in", "out"));
    }

    public String filterText(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = text.split("\\s+");

        for (String word : words) {
            String wordWithoutPunctuation = word.replaceAll(PUNCTUATION_REGEX, "");
            if (wordsToExclude.contains(wordWithoutPunctuation.toLowerCase())) {
                String maybePunctuation = word.replaceAll(ONLY_LETTERS_REGEX, "");
                stringBuilder.append(maybePunctuation);
            } else {
                stringBuilder.append(" ");
                stringBuilder.append(word);
            }
        }
        capitalizeFirstLetters(stringBuilder);
        return stringBuilder.toString().trim();
    }

    private void capitalizeFirstLetters(StringBuilder stringBuilder) {
        capitalizeFirstLettersFotSentenceSeparator(stringBuilder, ". ");
        capitalizeFirstLettersFotSentenceSeparator(stringBuilder, "! ");
        capitalizeFirstLettersFotSentenceSeparator(stringBuilder, "? ");
    }

    private void capitalizeFirstLettersFotSentenceSeparator(StringBuilder stringBuilder, String separator) {
        int indexOfSentenceEnd = stringBuilder.indexOf(separator);
        while ((indexOfSentenceEnd != -1) && (indexOfSentenceEnd + separator.length() < stringBuilder.length())) {
            int replacementStart = indexOfSentenceEnd + separator.length();

            String capitalizedLetter = String.valueOf(stringBuilder.charAt(replacementStart)).toUpperCase();
            stringBuilder.replace(replacementStart, replacementStart + 1, capitalizedLetter);

            indexOfSentenceEnd = stringBuilder.indexOf(separator, indexOfSentenceEnd + separator.length());
        }
    }
}
