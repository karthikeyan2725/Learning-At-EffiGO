public class F2_ParamReturn {
    public static void main(String args[]){
        double area1 = calculateArea(3.0, 2.0);
        double area2 = calculateArea(3.23, 6.0);

        System.out.println(area1 + " " + area2);
    }
    
    public static double calculateArea(double height, double width){
        double area = height * width;
        return area;
    }
}
