import java.util.*;

class Student implements Comparable<Student>{
    int age;
    public Student(int age){
        this.age = age;
    
    }

    public String toString(){
        return "Student Age : " + age; 
    }

    @Override
    public int compareTo(Student that) {
        if (this.age%10 > that.age%10){
            return 1;
        }
        return -1;
    }
}

public class Comparables {
   public static void main(String args[]){
    List<Student> students = new ArrayList<>();
    students.add(new Student(14));
    students.add(new Student(31));
    students.add(new Student(90));
    students.add(new Student(99));
    Collections.sort(students);
    System.out.println(students);
   } 
}
