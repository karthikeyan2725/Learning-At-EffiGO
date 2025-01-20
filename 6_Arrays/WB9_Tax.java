import java.util.Arrays;

public class WB9_Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        for( int i = 0; i < price.length; i++){
            afterTax[i] = (13/100.0) * price[i] + price[i];
        } 

        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
