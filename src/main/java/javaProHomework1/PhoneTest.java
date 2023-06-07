package javaProHomework1;

/*2.Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов.*/
public class PhoneTest {
    public static void main(String[] args) {
        Phone  phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        System.out.println("int : " + phone.number);
        System.out.println("float : " + phone1.weight);
        System.out.println("String : " + phone2.model);
        phone.setNumber(1234567890);
        phone1.setNumber(98765432);
        phone2.setNumber(900000009);

        phone.receiveCall("Anna");
        System.out.println("номер телефона  : " + phone.getNumber());
        System.out.println();
        phone.receiveCall("Alex");
        System.out.println("номер телефона  : " + phone1.getNumber());
        System.out.println();
        phone.receiveCall("Georg");
        System.out.println("номер телефона  : " + phone2.getNumber());
        System.out.println();
    }
}
/*
        int : 0
        float : 0.0
        String : null
        Вызван метод receiveCall
        Звонит :Anna
        номер телефона  : 1234567890

        Вызван метод receiveCall
        Звонит :Alex
        номер телефона  : 98765432

        Вызван метод receiveCall
        Звонит :Georg
        номер телефона  : 900000009


        Process finished with exit code 0*/
