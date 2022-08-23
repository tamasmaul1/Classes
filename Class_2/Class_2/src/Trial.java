import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Trial {
    public static void main(String[] args){
        String sampleInput = "Hello World How Are You";

        //formatTheInput(sampleInput);
        display(formatTheInput(sampleInput));
    }

    private static Map formatTheInput(String sampleInput) {
        String[] split = sampleInput.split(" ");
        Map<Character, List<String>> dictionary = new HashMap<Character, List<String>>();
        for(int i = 0; i < split.length; i++){
            char firstChar = split[i].charAt(0);
            if(dictionary.containsKey(firstChar)){
                dictionary.get(firstChar).add(split[i]);
            }
            else{
                List<String> words = new ArrayList<String>();
                words.add(split[i]);
                dictionary.put(firstChar, words);
            }
        }
        return dictionary;
    }

    private static void display(Map<Character, List<String>> dictionary) {
        for (Entry<Character, List<String>> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    
}
