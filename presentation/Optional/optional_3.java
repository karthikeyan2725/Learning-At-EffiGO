package Optional;

import java.util.Optional;

class optional_3{
    public static void main(String[] args){
        Optional<Integer> optional = Optional.empty();
        
        if(optional.isPresent()){
            System.out.println("Optional Not null");
        } else{
            System.out.println("Optional Null");
        }
    }
}