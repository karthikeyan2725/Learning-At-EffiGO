public class UpperBoundsInGenerics <T extends B>{
    T value;
    public UpperBoundsInGenerics(T value){
        this.value = value;
    }
    
    public String toString(){
        return value.getClass().getSimpleName();
    }

    public static void main(String[] args){
        UpperBoundsInGenerics<C> genericObj = new UpperBoundsInGenerics<>(new C());
        System.out.println(genericObj);
    }
}

class A{
}

class B extends A{

}

class C extends B{

}
