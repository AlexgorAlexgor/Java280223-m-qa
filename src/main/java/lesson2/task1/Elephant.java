package lesson2.task1;

public class Elephant extends LandAnimal{
    @Override
    public void move() {
        System.out.println("Elephant go");
    }

    @Override
    public void feed() {
        System.out.println("Elephant too");
    }
}
