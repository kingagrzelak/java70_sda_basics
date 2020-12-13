package exercises_2MZ;

import java.util.HashMap;
import java.util.Map;

public class DateConverter {
    private Map<Integer, String> dayName;

    public DateConverter(){
        this.dayName = new HashMap<>();
        initDays();
    }

    private void initDays(){
        this.dayName.put(1, "Monday");
        this.dayName.put(2, "Tuesday");
        this.dayName.put(3, "Wednesday");
        this.dayName.put(4, "Thursday");
        this.dayName.put(5, "Friday");
        this.dayName.put(6, "Saturday");
        this.dayName.put(7, "Sunday");
    }

    public void getDayName(int day){
        System.out.println("Day name is " + this.dayName.get(day));
    }
}
