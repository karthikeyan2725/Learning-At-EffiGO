public class StoreAny<T>{
    private T value; 

    StoreAny(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

class UsingGenerics{
    public static void main(String[] args) {
        StoreAny<String> storeString = new StoreAny<>("Hello");
        System.out.println(storeString.getValue());
    }
}