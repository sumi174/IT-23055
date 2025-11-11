// WordFrequencyTreeMap.java
// Program to store mappings of words to their frequencies using TreeMap

import java.util.*;

public class WordFrequencyTreeMap {
    public static void main(String[] args) {
        String text = "java collection framework java map tree map java";
        String[] words = text.split(" ");

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies (Sorted by word):");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
