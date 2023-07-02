package javaQAHomework1;

public class ArrayForChar {
    private static char[] arrayForChar =  new char[5];      //  Массив, в который пишем данные
    private static int countForChar = 0;                  // Счетчик массива - указывает на свободную ячейку памяти, также указывает на количество элементов(преимущества счета с нуля)

    public static void addForChar(char dataOfChar){
        if(countForChar == arrayForChar.length){            // Проверяем не закончилась ли память
            char [] tempForChar = arrayForChar;               // Копируем массив во временный массив
            arrayForChar = new char[2*arrayForChar.length];  // Выделяем в два раза больше памяти
            copyForChar(tempForChar);                       // Вызываем метод для копирования старого массива
        }
        arrayForChar[countForChar] = dataOfChar;              // Обращаемся по счетчику к свободному элементу массива и вставляем в него элемент
        countForChar++;                          // Увеличиваем счетчик
    }
    private static void copyForChar(char[] tempForChar) { //Метод для копирования элементов массива
        for (int i = 0; i < tempForChar.length; i++) {  // Поэлементно копируем массив
            arrayForChar[i] = tempForChar[i];
        }
    }
    /**
     * Метод для удаления элемента
     */
    public void deleteElementForChar(){
        countForChar--;
    }

    /**
     * Метод для удаления массива
     */
    public void deleteArrayForDouble(){
        countForChar = 0;
    }
    /**
     * Метод, который симулирует взлом нашей программы
     */
    public void hackForChar(){
        countForChar = arrayForChar.length;
    };

    /**
     * Метод для стирания данных
     */

    public void eraseForChar(){
        for (int i = 0; i < arrayForChar.length; i++) {
            arrayForChar[i] = 0;
        }
    }

    /**
     * Метод для вывода всей выделенной памяти под массив
     */
    public void displayForChar(){
        System.out.println("Выделенная память: ");
        for (int i = 0; i < arrayForChar.length; i++) {
            System.out.print(arrayForChar[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для вывода массива
     */
    public void displayInitializedForChar(){
        System.out.println("Массив: ");
        for (int i = 0; i < countForChar; i++) {
            System.out.print(arrayForChar[i] + " ");
        }
        System.out.println();
    }



}

