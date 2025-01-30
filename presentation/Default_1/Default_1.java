package Default_1;

interface FakeList{
    default void stream(){
        System.out.println("Streaming data...");
    }
}

class FakeArrayList implements FakeList{

}

public class Default_1 {
    public static void main(String[] args){
        FakeArrayList fakeArrayList = new FakeArrayList();
        fakeArrayList.stream();
    }
}
