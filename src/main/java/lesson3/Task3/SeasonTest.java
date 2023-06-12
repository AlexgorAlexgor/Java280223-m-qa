package lesson3.Task3;

public class SeasonTest {
    public static void main(String[] args) {
Season season= Season.SUMMER;
        System.out.println(season);
        System.out.println("descript. season : ");
        System.out.println("getDescr: "+season.getDescription());
        System.out.println("getsannyDay: "+season.getSunnyDay());

        Season season1 =Season.WINTER;
        System.out.println("gesamt beschreibung");
        season1.printCommonDescription();
        season.printCommonDescription();
        //abstract method
        System.out.println("months year : ");
        System.out.println(season.getMonths());
        System.out.println(season1.getMonths());
    }

}
