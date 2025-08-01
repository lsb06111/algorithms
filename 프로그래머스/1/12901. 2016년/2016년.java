import java.util.*;
import java.time.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int dayIndex = dayOfWeek.getValue() % 7; 
        return days[dayIndex];
    }
}