package JavaProSummaryHomework1;
//Напишите программу на Java для создания класса "Треугольник" (Triangle), который будет иметь следующие свойства:
//        Сторона A (sideA) - вещественное число;
//        Сторона B (sideB) - вещественное число;
//        Сторона C (sideC) - вещественное число.
//        Класс "Треугольник" должен иметь методы для вычисления периметра треугольника и площади треугольника. Также класс может иметь метод для определения типа треугольника (равносторонний, равнобедренный, разносторонний).
//        В главном классе программы создайте объект класса "Треугольник" с заданными сторонами и выведите на экран периметр и площадь этого треугольника, а также его тип, используя соответствующие методы класса "Треугольник".

public class Triangle3 {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle3(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2; // полупериметр треугольника
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // формула Герона для расчета площади
    }

    public String determineType() {
        if (sideA == sideB && sideB == sideC) {
            return "Равносторонний треугольник";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Равнобедренный треугольник";
        } else {
            return "Разносторонний треугольник";
        }
    }

    public static void main(String[] args) {
        // Создание объекта класса "Треугольник" и демонстрация его использования
        Triangle3 triangle = new Triangle3(5.5, 4.2, 7.1);

        // Вывод информации о треугольнике
        System.out.println("Сторона A: " + triangle.getSideA());
        System.out.println("Сторона B: " + triangle.getSideB());
        System.out.println("Сторона C: " + triangle.getSideC());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Тип треугольника: " + triangle.determineType());
    }
}
