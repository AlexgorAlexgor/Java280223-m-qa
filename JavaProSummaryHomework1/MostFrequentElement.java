package JavaProSummaryHomework1;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public MostFrequentElement(int[] arr) {

    int[] array = arr;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentElement = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mostFrequentElement = element;
                maxFrequency = frequency;
            }
        }

        System.out.println("Наиболее часто встречающийся элемент в целочисленном массиве: " + mostFrequentElement);

        System.out.println();
    }
}

