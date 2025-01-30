import java.util.*;

public class Comparators {
    
    public static void main(String args[]){
        List<Integer> arrayList = new ArrayList<>();

        Comparator<Integer> lastDigitComparator = (a,b) -> (a%10 > b%10) ? 1 : -1;

        // Populating array with random integers
        for(int i = 10; i > 0; i--){
            arrayList.add((int)(Math.random() * 100));
        }

        System.out.println("Before:" + arrayList);
        Collections.sort(arrayList, lastDigitComparator);
        System.out.println("After:" + arrayList);
    }
}
