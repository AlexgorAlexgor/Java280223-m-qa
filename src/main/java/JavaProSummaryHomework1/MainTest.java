package JavaProSummaryHomework1;

public class MainTest {
    static int[] array = {-2, 1, -42, 4, -6, 8, -12, 16, 31, 33};
    static float[] numbers = {0.96F, 2.5F, 4.84F, 3.7F, 1.8F, 6.92F, 4.2F, 2.1F, 3.9F, 4.76F};
    static String[] arrayStr = {"Apple", "Banana", "Orange", "Apple", "Mango"};

    public static int main(String[] args) {
        System.out.println("Summary session: JavaPro. Описание задания.");
        System.out.println("в целочисленном массиве {-2, 1,-42, 4, -6, 8, -12, 16, 31,33}");
        System.out.println("в массиве с плавающей точкой {0.96F,2.5F, 4.84F,3.7F, 1.8F,6.92F, 4.2F, 2.1F,3.9F,4.76F}");
        System.out.println("в строковом массиве {\"Apple\", \"Banana\", \"Orange\", \"Apple\", \"Mango\"}");
        System.out.println("#1. Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве  и выводит результат.");
        arrayIntegerSum();

        System.out.println("#2. Напишите программу на Java, которая находит среднее значение всех элементов в массиве с плавающей точкой  и выводит результат.");
        averageFloatArray();

        System.out.println("#3.  Напишите программу на Java, которая находит наименьший и наибольший элементы в целочисленном массиве  и выводит их значения.");
        minMaxIntegerFinder();

        System.out.println("#4. Напишите программу на Java, которая находит количество отрицательных элементов в целочисленном массиве  и выводит результат. ");
        negativeCounter();

        System.out.println("#5 Напишите программу на Java, которая находит индекс первого вхождения заданного элемента в строковом массиве и выводит его значение.");
        arrayEnterString();
        System.out.println("#6 Напишите программу на Java, которая сортирует целочисленный массив в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).");
        // MergeSort(){};

//        private static void arrayEnterString () {String target};
//        {
//            //   String[] array = {"Apple", "Banana", "Orange", "Apple", "Mango"};
//            String target = "Apple";
//
//            int index = findIndexOfElement(arrayStr, target);
//            if (index != -1) {
//                System.out.println("Индекс первого вхождения  " + target + "   равен: " + index);
//            } else {
//                System.out.println("Element " + target + " Не найден.");
//            }
//        }

    }

    private static void arrayEnterString() {
        String target = "Apple";

        int index = findIndexOfElement(arrayStr, target);
        if (index != -1) {
            System.out.println("Индекс первого вхождения  " + target + "   равен: " + index);
        } else {
            System.out.println("Element " + target + " Не найден.");
        }

        private static void negativeCounter () {
            int count = 0;
            for (int arr : array) {
                if (arr < 0) count++;
            }
            System.out.println("Количество отрицательных элементов: " + count);
        }

        private static void minMaxIntegerFinder () {
            int min = array[0];
            int max = array[0];
            for (int arr : array) {
                if (arr < min) {
                    min = arr;
                }
                if (arr > max) {
                    max = arr;
                }
            }
            System.out.print("Наименьший элемент: " + min);
            System.out.println(" ;   Наибольший элемент: " + max);
        }

        private static void averageFloatArray () {
            float sum = 0;
            for (float number : numbers) {
                sum += number;
            }
            float average = sum / numbers.length;
            System.out.println("Среднее значение: " + average);
        }

        private static void arrayIntegerSum () {
            int sum = 0;
            for (int arr : array) sum += arr;
            System.out.println("Сумма элементов массива: " + sum);
        }


        (String[]arrayStr, String target){
            for (int i = 0; i < arrayStr.length; i++) {
                if (arrayStr[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }


    }

