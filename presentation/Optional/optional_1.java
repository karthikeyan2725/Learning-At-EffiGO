package Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class optional_1{
    public static void main(String args[]){
        List<Integer> arrayList = Arrays.asList(1,3);
        System.out.println(
            arrayList.stream()
                .filter((num)->num%2==0)
                .findFirst()
        );
    }
}