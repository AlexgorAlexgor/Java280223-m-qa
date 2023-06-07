package javaProHomework1;

/*1.Класс Person
        Создать класс Person, который содержит:

        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        Добавьте два конструктора  - Person() и Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)*/
public class PersonTest {
    public static <talk> void main(String[] args) {

        Person person = new Person();
        person.move();
        person.talk();

        Person person1 = new Person("Boris", 39);
        person.fullName = "Jonson";
        System.out.println("fullName  : " + person.fullName);
        person.age = 55;
        System.out.println("age :" + person.age);
        person1.fullName = "Kristina";
        person1.age = 22;
        System.out.println("fullName  : " + person1.fullName);
        System.out.println("age :" + person1.age);
        person1.talk();
        person.move();
        person.talk();
        person1.move();
    }

}
   /* Вызван конструктор класса Person
Вызван метод move
Person : null говорит
Вызван метод talk
Person : null говорит
Вызван конструктор класса Person  : Boris  age  39
fullName  : Jonson
age :55
fullName  : Kristina
age :22
Вызван метод talk
Person : Kristina говорит
Вызван метод move
Person : Jonson говорит
Вызван метод talk
Person : Jonson говорит
Вызван метод move
Person : Kristina говорит

Process finished with exit code 0 0*/