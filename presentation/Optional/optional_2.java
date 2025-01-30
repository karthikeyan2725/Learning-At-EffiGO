package Optional;

import java.util.Optional;

class optional_2{
    public static void main(String[] args){
        Optional<Integer> optional = Optional.of(10);
        
        if(optional.isPresent()){
            System.out.println("Optional Not null");
        } else{
            System.out.println("Optional Null");
        }
    }
}