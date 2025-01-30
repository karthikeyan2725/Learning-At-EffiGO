package Lambda_3;
interface Vehicle{
    void honk(); // Functional Interface
}

class Lambdas3{
    public static void main(String args[]){
        Vehicle vehicle = () -> System.out.println("Honk... Honk...");
        vehicle.honk();
    }
}
