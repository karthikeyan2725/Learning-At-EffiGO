package Static_Method;

interface A {
    static void printy(){
        System.out.println("The static interface method is called.");
    }
}

public class Static {
    public static void main(String[] args){
        A.printy();
    }
}
