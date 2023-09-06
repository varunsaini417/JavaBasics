
package studentsystem;

import java.util.Scanner;

class Student{
   public int rollNo;
   public String Name;
   public double m1,m2,m3;
   
   public double totalMarks(){
       return m1+m2+m3;
   }
   public double average(){
       return totalMarks()/3;
   }
   
   public String grade(){
       if(average()>60){
           return "A";
       }else{
           return "B";
       }
   }
}

public class StudentSystem {

    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you roll number");
        s1.rollNo = sc.nextInt();
        System.out.println("Enter you name: ");
        s1.Name = sc.nextLine();
        System.out.println("Now enter the marks for 3 subjects");
        s1.m1 = sc.nextDouble();
        s1.m2 = sc.nextDouble();
        s1.m3 = sc.nextDouble();
        
        System.out.println("Calculating your grades: " + s1.grade());
        
        
        
    }
    
}
