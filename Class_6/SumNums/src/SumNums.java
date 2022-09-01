import java.util.*;

public class SumNums {
    public static int[] Dividers = {3, 5};

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        int result = sumNums(num);
        System.out.println("The result is: " + result);
    }
    public static boolean isDivisable(int num, int[] dividers){
        for(int divider:dividers){
            if(num%divider == 0){return true;}
        }
        return false;
    }

    public static int sumNums(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(isDivisable(i, SumNums.Dividers)) {
                result += i;
            }
        }
        return result;
    }
}
