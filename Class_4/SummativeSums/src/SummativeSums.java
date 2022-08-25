import java.util.*;

public class SummativeSums {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99));
        int result = sumList(list);
        System.out.println(result);
    }
    public static int sumList(List<Integer> list){
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            result += list.get(i);
        }
        return result;
    }
}
