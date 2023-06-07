package JavaProSummaryHomework1;
//        (Сложность 5) Напишите программу на Java, которая сортирует целочисленный массив в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).
//        (Сложность 5) Напишите программу на Java, которая находит наиболее часто встречающийся элемент в целочисленном массиве и выводит его значение.
//        (Сложность 5) Напишите программу на Java, которая объединяет два отсортированных целочисленных массива в один отсортированный массив, используя алгоритм слияния (merge).
//        (Сложность 5) Напишите программу на Java, которая находит наибольшую возрастающую последовательность в целочисленном массиве и выводит ее значения.
//        (Сложность 5) Напишите программу на Java, которая находит пару элементов в целочисленном массиве, сумма которых равна заданному числу, и выводит их значения.
//Задача 1 (Сложность 4/10):
//Напишите программу на Java для создания класса "Студент" (Student), который будет иметь следующие свойства:
//Имя (name) - строка;
//Возраст (age) - целое число;
//Средний балл (averageGrade) - вещественное число.
//Класс "Студент" должен иметь конструкторы для инициализации объекта с именем и возрастом или с именем, возрастом и средним баллом. Также класс должен иметь методы для установки и получения значений свойств.
//В главном классе программы создайте несколько объектов класса "Студент" и продемонстрируйте их использование, например, выведя информацию о студентах на экран.
//Задача 2 (Сложность 5/10):
//Напишите программу на Java для создания класса "Треугольник" (Triangle), который будет иметь следующие свойства:
//Сторона A (sideA) - вещественное число;  Сторона B (sideB) - вещественное число; Сторона C (sideC) - вещественное число.
//Класс "Треугольник" должен иметь методы для вычисления периметра треугольника и площади треугольника. Также класс может иметь метод для определения типа треугольника (равносторонний, равнобедренный, разносторонний).
//В главном классе программы создайте объект класса "Треугольник" с заданными сторонами и выведите на экран периметр и площадь этого треугольника, а также его тип, используя соответствующие методы класса "Треугольник".


import static JavaProSummaryHomework1.MainTest.array;

public  class MergeSort {

int [] array1 =  array ;
      public static void main(String[] args) {
    //int [] array ={-2, 1,-42, 4, -6, 8, -12, 16, 31,33};
        System.out.println("Unsorted Array:");

     printArray(array1);

    mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
         printArray(array1);
    }

    public static void mergeSort(int[] array1, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array1, left, middle);
            mergeSort(array1, middle + 1, right);

            merge(array1, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array1) {
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
