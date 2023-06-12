package lesson3.Task3;

public enum Season {
    WINTER("winter cold ", 30){
        @Override
        public String getMonths() {
            return "Desember, Januar, Februar";
        }
    },
    SPRING("spring warm ", 45){
        @Override
        public String getMonths() {
            return "Matz, April, Mai";
        }
    },
    SUMMER("summer hits ", 60){
        @Override
        public String getMonths() {
            return "Juni, Juli , August";
        }

    },
    AUTUMN(" autumn warm ", 50){
        @Override
        public String getMonths() {
            return "September, Oktober, November";
        }
    };
    private String description;
    private int sunnyDay;

    /*//default constructor
     Season (){
         System.out.println("season constructor");
     }*/
    Season(String description, int sunnyDay) {
        System.out.println("ruf constructor : " + description +" ,sunny day: "+ sunnyDay);
        this.description = description;
        this.sunnyDay = sunnyDay;
    }

    public String getDescription() {
        return description;
    }

    public int getSunnyDay() {
        return sunnyDay;
    }

    public void printCommonDescription (){
        System.out.println("this one from all season");
    }
    public abstract  String getMonths();
}
