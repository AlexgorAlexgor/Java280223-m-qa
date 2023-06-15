package JavaProSummaryHomework1;

public class AverageOfArrayElements {
    public AverageOfArrayElements(double[] arr) {
        double [] array = arr;
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("Среднее значение всех элементов в массиве с плавающей точкой: "  + average);
        System.out.println();
    }


    }
