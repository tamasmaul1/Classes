import java.util.*;

public class MultiTable {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
        for(int i = 1; i <= 12; i++){
            ArrayList<Integer> kula = new ArrayList<>();
            for(int x = 1; x <= 12; x++){
                kula.add(i*x);
            }
            table.add(kula);
        }
        for(int i = 0; i < 12; i++){
            System.out.println(table.get(i));
        }
    }
}
