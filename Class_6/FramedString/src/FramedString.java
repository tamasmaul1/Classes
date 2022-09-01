import java.util.*;

public class FramedString {
    public static void main(String args[]){
        List<String> words = new ArrayList<String>(Arrays.asList("Hello", "World", "in", "a", "frame", "test", "tsttttttttttttttttttttttttttt"));
        int max = 0;
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).length() > max){
                max = words.get(i).length();
            }
        }
        String firstline = "";
        for(int i = 0; i < max+4; i++){
            firstline += "*";
        }
        System.out.println(firstline);
        for(int i = 0; i < words.size(); i++){
            String endborder = "";
            for(int x = 0; x < max+2-words.get(i).length(); x++){
                endborder += " ";
            }
            System.out.println("* " + words.get(i) + endborder + "*");
        }
        System.out.println(firstline);
    }
}

