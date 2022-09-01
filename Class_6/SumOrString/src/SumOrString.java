import java.util.*;

public class SumOrString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = getInputNumber(scanner);
        System.out.println("Which command would you like to run?");
        System.out.println("1-Sum the numbers from 1 to n\n2-Write the numbers from 1 to n in a sequence: ");
        int choice = getInputNumber(scanner);
        runChoice(choice, num);
    }

    public static int getInputNumber(Scanner scanner){
        boolean valid_input = false;
        int num = 0;
        while(valid_input == false){
            try {
                System.out.print("Please enter a number: ");
                String input = scanner.nextLine();
                num = Integer.parseInt(input);
                valid_input = true;
            }
            catch (NumberFormatException  e) {
                System.out.println("Invalid Input - the input needs to be a number");
            }
        }
        return num;
    }

    public static void runChoice(int choice, int num){
        switch(choice){
            case 1: System.out.println(sumOfNumbers(num)); break;
            case 2: System.out.println(stringOfNumbers(num)); break;
            default: System.out.println("Invalid choice, you could only pick 1 or 2, try again.");
        }
    }

    public static int sumOfNumbers(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += i;
        }
        return result;
    }

    public static String stringOfNumbers(int num){
        String result = "";
        for (int i = 0; i < num; i++) {
            result += i + ",";
        }
        return result;
    }
}
