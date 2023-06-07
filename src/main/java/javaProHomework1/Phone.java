package javaProHomework1;

/*2.Класс Phone.
         Создайте класс Phone, который содержит переменные number, model и weight.
         Создайте три экземпляра этого класса.
         Выведите на консоль значения их переменных.
         Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
         Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
         Вызвать эти методы для каждого из объектов.*/
public class Phone {


    int number;
    String model;
    float weight;
    String receiveName;

    public void receiveCall(String receiveName) {
        System.out.println("Вызван метод receiveCall ");
        System.out.println("Звонит :"+receiveName);
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }
}
