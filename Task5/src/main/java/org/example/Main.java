package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "/Users/zabulonov/IdeaProjects/JavaAdvanced/Task5/src/main/java/org/example/text.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            Map<String, Integer> wordCount = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCount.entrySet());
            entries.sort(Map.Entry.comparingByKey());

            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            int maxCount = Collections.max(wordCount.values());
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() == maxCount) {
                    System.out.println("Слово с максимальным количеством повторений: " + entry.getKey() + " (" + maxCount + " раз)");
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}