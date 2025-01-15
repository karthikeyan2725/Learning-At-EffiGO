public class F3_DocComments {

    /**
     * Function Name : greet
     * 
     * Inside the function:
     * 1. Print hello
     */
    public static void greet(){
        System.out.println("Hello");
    }

    /**
     * Function Name : printText
     * 
     * @param name (String)
     * @param age (String)
     * 
     * Inside the function :
     * 1. print name and age
     */
    public static void printText(String name, String age){
        System.out.println("I'm " + name + " and I'am " + age + " years old");
    }

    /**
     * @param height (double)
     * @param width  (double)
     * @return       (double)
     */
    public static double calculateArea(double height, double width){
        double area = height * width;
        return area;
    }
}
