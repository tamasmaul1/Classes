import java.util.*;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How old are you?: ");
        int age = myScanner.nextInt();
        int max_hr = 220 - age;
        System.out.println("Your maximum hearth rate should be: " + max_hr + " beats per minute");
        double target_hr_min = Math.ceil((double)max_hr*(double)0.5);
        double target_hr_max = Math.floor((double)max_hr*(double)0.85);
        System.out.println("Your target HR zone is " + (int)target_hr_min + " - " + (int)target_hr_max + " beats per minute");
    }
}
