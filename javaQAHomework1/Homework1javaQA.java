package javaQAHomework1;

import javaQAlesson6.ArrayWorking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Homework1javaQA {
    public static Scanner scanner = new Scanner(System.in);              // Объект для чтения ввода пользователя
    public static Random random = new Random();                          // Создаю глобальный объект для генерации случайных чисел

    public static void main(String[] args) {
        System.out.println("##  Java for QA.     Описание задания.");
        System.out.println("# 1.1) Повторить(переписать) класс для типа double");
        ArrayForDouble arrayForDouble = new ArrayForDouble();
        arrayForDouble.addForDouble(1.23);
        arrayForDouble.displayForDouble();
        arrayForDouble.addForDouble(4.32);
        arrayForDouble.displayInitializedForDouble();
        System.out.println("Удаление элемента из массива double: ");
        arrayForDouble.deleteElementForDouble();
        arrayForDouble.displayForDouble();
        arrayForDouble.displayInitializedForDouble();
        System.out.println("  1.2) Повторить(переписать) класс для  типа char");
        ArrayForChar arrayForChar = new ArrayForChar();
        ArrayForChar.addForChar('G');
        arrayForChar.displayForChar();
        ArrayForChar.addForChar('r');
        arrayForChar.displayInitializedForChar();
        System.out.println("Удаление элемента из массива char: ");
        arrayForChar.deleteElementForChar();
        arrayForChar.displayForChar();
        arrayForChar.displayInitializedForChar();
        System.out.println();
        System.out.println("#2) Ознакомиться с классом ArrayList и решить задачи:");//    2) Ознакомиться с классом ArrayList и решить задачи:
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("# 2.1) Вставить в него 5 элементов");
        for (int i = 0; i < 5; i++) {                       // В цикле создаем 5 случайных чисел в диапазоне до 100 и добавляем их в массив
            arrayList.add(random.nextInt(100));
        }
        System.out.println("Неупорядоченный массив: (+add)" + arrayList);
        System.out.println("#2.2) Удалить из него 4 элемента");
        for (int j=4 ;j>0;j--){arrayList.remove(j);
        }
        System.out.println("Неупорядоченный массив:(-delete) " + arrayList);

        System.out.println("#2.3) Снова вставить в него 3 элемента и найти один из элементов в этой структуре - вывести его на консоль");
        for (int i = 1; i < 4; i++) {                       // В цикле создаем 3 случайных чисел в диапазоне до 100 и добавляем их в массив
            arrayList.add(random.nextInt(100));}
        System.out.println("Неупорядоченный массив: " + arrayList);
        int index= random.nextInt(4);
        System.out.println("random "+index+"-th element is : "+arrayList.get(index));
    }
}
