import java.util.*;

public class DogGenetics {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is the name of your dog?: ");
        String dog_name = myScanner.nextLine();
        List<String> dog_breeds = Arrays.asList("St. Bernard", "Chihuahua", "Asian Pug", "American bully", "Cane Corso");
        List<String> result = generateDNA(dog_breeds);
        System.out.println("Well then, I have this highly reliable report on"+ dog_name +"'s prestigious background right here.\n");
        System.out.println(dog_name + " is: \n");
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        System.out.print("\nWow, that's QUITE the dog!");
    }

    private static List generateDNA(List<String> dog_breeds) {
        Random rand = new Random();
        Collections.shuffle(dog_breeds);
        List<String> result = new ArrayList<>();
        int percentage = 100;
        for(int i = 0; i < 5; i++){
            int x = rand.nextInt(1,percentage);
            percentage = percentage - x;
            if(i == 4){
                x += percentage;
            }
            result.add(x +"% " + dog_breeds.get(i));
        }
        return result;
    }
}
