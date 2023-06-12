package lesson3.Task1;

public class DayTest {
    public static void main(String[] args) {

        Day day = Day.THURSDAY;
        System.out.println("current day:"+day);
        switch (day){
            case MONDAY -> System.out.println("this MONDAY");
            
            case TUESDAY -> System.out.println("this Tuesday");
            
            case WEDNESDAY -> System.out.println("this Wednesday");
            
            case THURSDAY -> System.out.println("this Thursday");
            
            case FRIDAY -> System.out.println("this FRIDAY");
            case SATURDAY -> System.out.println("this SATURDAY");

            case SUNDAY -> System.out.println("this SUNDAY");

        }
    }

}
