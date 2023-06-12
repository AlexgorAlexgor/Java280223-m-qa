package lesson2.task1;

public abstract class Animal {
    public int weight;

  private String privateField;
    public Animal(){
        System.out.println("* constructor Animal");
    }

public abstract void feed();
    private void privateMethod(){
        System.out.println("Test");
    }

    public String getPrivateField() {
        return privateField;
    }
}
