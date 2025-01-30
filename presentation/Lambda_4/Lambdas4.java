package Lambda_4;

interface Adder{
    int addOne(int number);
}

public class Lambdas4 {
    public static void main(String args[]){
        Adder adder = (num) -> {return num + 1;};
        System.out.println(adder.addOne(2));
    }
}
