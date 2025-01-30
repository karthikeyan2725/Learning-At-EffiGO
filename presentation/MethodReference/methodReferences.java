package MethodReference;
import java.util.*;

public class methodReferences {
    public static void main(String[] args){
        List<Integer> array = Arrays.asList(1,2,3);
        
        array.stream().forEach(num -> {System.out.println(num);});

        array.stream().forEach(System.out::println);
    }
}
