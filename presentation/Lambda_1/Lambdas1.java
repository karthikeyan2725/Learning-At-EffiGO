package Lambda_1;

interface Vehicle{
    void honk(); // public abstract
}

class Car implements Vehicle{
    public void honk(){
        System.out.println("Honk... Honk");
    }
}

class Lambdas1{
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.honk();
    }
}
