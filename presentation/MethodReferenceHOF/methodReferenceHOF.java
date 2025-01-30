package MethodReferenceHOF;

import java.util.function.Predicate;

public class methodReferenceHOF {
    public static Boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args){
        Predicate<Integer> methodReference = methodReferenceHOF::isEven;

        System.out.println(methodReference.test(2));
    }
}
