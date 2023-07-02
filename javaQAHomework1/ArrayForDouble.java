package javaQAHomework1;

public class ArrayForDouble {
    private double[] arrayForDouble =  new double[5];      //  Массив, в который пишем данные
    private int countForDouble = 0;                  // Счетчик массива - указывает на свободную ячейку памяти, также указывает на количество элементов(преимущества счета с нуля)

    public void addForDouble(double dataOfDouble){
        if(countForDouble == arrayForDouble.length){            // Проверяем не закончилась ли память
            double [] tempForDouble = arrayForDouble;               // Копируем массив во временный массив
            arrayForDouble = new double[2*arrayForDouble.length];  // Выделяем в два раза больше памяти
            copyForDouble(tempForDouble);                       // Вызываем метод для копирования старого массива
        }
        arrayForDouble[countForDouble] = dataOfDouble;              // Обращаемся по счетчику к свободному элементу массива и вставляем в него элемент
        countForDouble++;                          // Увеличиваем счетчик
    }
    private void copyForDouble(double[] tempForDouble) { //Метод для копирования элементов массива
        for (int i = 0; i < tempForDouble.length; i++) {  // Поэлементно копируем массив
            arrayForDouble[i] = tempForDouble[i];
        }
    }
    /**
     * Метод для удаления элемента
     */
    public void deleteElementForDouble(){
        countForDouble--;
    }

    /**
     * Метод для удаления массива
     */
    public void deleteArrayForDouble(){
        countForDouble = 0;
    }
    /**
     * Метод, который симулирует взлом нашей программы
     */
    public void hackForDouble(){
        countForDouble = arrayForDouble.length;
    };

    /**
     * Метод для стирания данных
     */

    public void eraseForDouble(){
        for (int i = 0; i < arrayForDouble.length; i++) {
            arrayForDouble[i] = 0;
        }
    }

    /**
     * Метод для вывода всей выделенной памяти под массив
     */
    public void displayForDouble(){
        System.out.println("Выделенная память: ");
        for (int i = 0; i < arrayForDouble.length; i++) {
            System.out.print(arrayForDouble[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для вывода массива
     */
    public void displayInitializedForDouble(){
        System.out.println("Массив: ");
        for (int i = 0; i < countForDouble; i++) {
            System.out.print(arrayForDouble[i] + " ");
        }
        System.out.println();
    }


}
