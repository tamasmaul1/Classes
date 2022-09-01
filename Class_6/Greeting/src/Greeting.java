import java.util.*;

public class Greeting {
    public static void main(String args[]){
        List<String> names_to_greet = new ArrayList<>(Arrays.asList("Biraj", "DAS"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        if(names_to_greet.contains(name)){
            System.out.print("Greetings, " + name);
        }
        else {
            System.out.print("Greetings");
        }
    }
}
