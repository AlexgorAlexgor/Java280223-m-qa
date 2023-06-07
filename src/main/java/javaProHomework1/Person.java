package javaProHomework1;
/*
1.Класс Person
        Создать класс Person, который содержит:

        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        Добавьте два конструктора  - Person() и Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)
*/

public class Person {
  /*  public static void main(String[] args) {

    }*/
String fullName;
int age;

  public   Person() {
        System.out.println("Вызван конструктор класса Person");
    };
    Person(String fullName, int age){
        System.out.println("Вызван конструктор класса Person  : "+fullName+"  age  "+age);

    };
void move(){
    System.out.println("Вызван метод move ");
    System.out.println("Person : "+fullName+" говорит");
};

    public void talk(){
        this.fullName =fullName;
        System.out.println("Вызван метод talk ");
        System.out.println("Person : "+fullName+" говорит");
    };



}
