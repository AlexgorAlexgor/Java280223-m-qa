package lesson2.task1;

public final class Dog extends LandAnimal{
    public int weight;

    public Dog(){
      System.out.println("*** constuctor Dod");
  }

    @Override
    public void feed() {

    }

    @Override
    public void move() {
        //super.move();
        System.out.println("dog laufs");
    }
    public void bark(){
        System.out.println("woof!");
    }
}
