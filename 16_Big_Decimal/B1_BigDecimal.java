import java.math.BigDecimal;

public class B1_BigDecimal {
    public static void main(String args[]){
        double x = 0.2;
        double y = 0.1;
        double z = x + y;
        System.out.println("Result of Double : " + z);

        BigDecimal a = new BigDecimal("0.2");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = a.add(b);
        System.out.println("Result of BigDecimal: " + c);

    }
}
