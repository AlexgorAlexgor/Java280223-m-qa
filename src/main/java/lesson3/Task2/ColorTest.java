package lesson3.Task2;

public class ColorTest {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color color : colors
        ) {
            System.out.println(color);
        }
        System.out.println("only blue color");
        for (Color currentColor : colors) {
            if (currentColor.equals(Color.BLUE)) {
                System.out.println("Blue");
            } else {
                System.out.println("other color");
            }
        }
        Color color =Color.BLUE;
        System.out.println(color.ordinal());

        Color color1=Color.valueOf("GREEN");
        System.out.println(color1);
    }
}
