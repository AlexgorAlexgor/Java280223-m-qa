package JavaProSummaryHomework1;
//Напишите программу на Java для создания класса "Студент" (Student), который будет иметь следующие свойства:
//        Имя (name) - строка;
//        Возраст (age) - целое число;
//        Средний балл (averageGrade) - вещественное число.
//        Класс "Студент" должен иметь конструкторы для инициализации объекта с именем и возрастом или с именем, возрастом и средним баллом. Также класс должен иметь методы для установки и получения значений свойств.
//        В главном классе программы создайте несколько объектов класса "Студент" и продемонстрируйте их использование, например, выведя информацию о студентах на экран.
public class Student2 {
    private String name;
    private int age;
    private double averageGrade;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student2(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public static void main(String[] args) {
        // Создание объектов класса "Студент" и демонстрация их использования
        Student2 student1 = new Student2("Иванов", 20);
        student1.setAverageGrade(4.5);

        Student2 student2 = new Student2("Петров", 22, 3.8);

        // Вывод информации о студентах
        System.out.println("Студент 1:");
        System.out.println("Имя: " + student1.getName());
        System.out.println("Возраст: " + student1.getAge());
        System.out.println("Средний балл: " + student1.getAverageGrade());

        System.out.println();

        System.out.println("Студент 2:");
        System.out.println("Имя: " + student2.getName());
        System.out.println("Возраст: " + student2.getAge());
        System.out.println("Средний балл: " + student2.getAverageGrade());
    }
}
