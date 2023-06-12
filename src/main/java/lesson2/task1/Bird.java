package lesson2.task1;

public class Bird extends Animal implements Flyable{
    @Override
    public void feed() {
        System.out.println("bird feed");
    }
    public void  Fly(){
        System.out.println("bird fly");
    }

    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
