public class A3_TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
            { 72,80,69,70 }, // Harry's grade
            { 69,76,68,59},  // Ron's grade
            { 99,97,99,100}  // Hermione's grade
        };

        System.out.println("Harry    : " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("Ron      : " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        System.out.println("Hermione : " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);

    }
}
