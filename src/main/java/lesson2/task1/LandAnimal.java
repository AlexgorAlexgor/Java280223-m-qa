package lesson2.task1;

public abstract class LandAnimal extends Animal{
    public LandAnimal(){
        System.out.println("** const.LandAnimal");
    }
    public abstract void move();

    @Override
    public void feed() {
        System.out.println("animal eat");
    }
    //    {
//       // System.out.println("land animal moves");
//    }
}
