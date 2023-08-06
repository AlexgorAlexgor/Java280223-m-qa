package javaQAHomework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // #1  Создать лист.
        // #2 В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
        int N = 10000000; // Количество значений

        // Заполнение листа
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
    // #3 Перебрать лист с помощью for-each, в цикле каждое значение листа записать в переменную temp.
        long startTime, endTime, duration;


        startTime = System.currentTimeMillis();
        for (int temp : list) { // Перебор с помощью for-each

        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("for-each: " + duration + " ms");
    // #4 Сделать то же самое с помощью классического for.
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("for: " + duration + " ms");

        // #5 Перебор с помощью классического for и вынос размера листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
        int size = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("for with cached size: " + duration + " ms");

        // #6 Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала
        startTime = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Reverse for: " + duration + " ms");

        // #7 Перебрать лист  с помощью Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Iterator: " + duration + " ms");

        // #8 Перебрать лист с помощью  ListIterator
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ListIterator: " + duration + " ms");
    }
}

