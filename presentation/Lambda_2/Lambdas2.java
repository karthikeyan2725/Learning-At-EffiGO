package Lambda_2;
interface Vehicle{
    void honk();
}

class Lambdas2{
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle(){
            public void honk(){
                System.out.println("Honk... Honk...");
            }
        };
        vehicle.honk();
    }
}