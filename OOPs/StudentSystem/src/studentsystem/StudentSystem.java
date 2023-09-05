
package studentsystem;

class Student{
   public int rollNo;
   public String Name,course;
   public int m1,m2,m3;
   
   public int totalMarks(){
       return m1+m2+m3;
   }
   public int average(){
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
        
    }
    
}
