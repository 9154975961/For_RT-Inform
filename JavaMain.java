import java.util.*;

public class JavaMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4, 7, 1, 4, 2, 3, 0);
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            if(countMap.containsKey(num)) {
                countMap.put(num, (countMap.get(num)+1)) ;
            } else {
                countMap.put(num, 1);
            }
        }
        System.out.println(countMap);
    }
}
