import java.time.LocalDate;
import java.util.*;

public class LeapYear {
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        List<Integer> leapyears = new ArrayList<Integer>();
        while(leapyears.size() < 20){
            if(isLeap(year)){
                leapyears.add(year);
            }
            year ++;
        }
        System.out.println(leapyears);
    }

    public static boolean isLeap(int year){
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        return leap;
    }
}
