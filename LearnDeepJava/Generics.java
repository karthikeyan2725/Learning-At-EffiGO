public class Generics<T>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public Generics(T value){
        this.value = value;
    }

    public static void main(){
        Generics<Integer> genericObj = new Generics<>(1);
        System.out.println(genericObj.getValue());
    }
}