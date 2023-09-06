
package studentsub;

class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private double marksObtain;
    
    private String getsubId(){return this.subId;}
    private String getName(){return this.name;}
    private int getMaxMarks(){return this.maxMarks;}
    private double getMarksObtain(){return this.marksObtain;}
    
    private void setMaxMarks(int mm){
        this.maxMarks = mm;
    }
    private void setMarksObtain(int mo){
        this.marksObtain = mo;
    }
    
    public Subject(){
       setMaxMarks(100);
       setMarksObtain(0);
        this.name = "NIL";
        this.subId ="NIL";
    }
    public Subject(String name, String subid){
        this.name = name;
        this.subId = subid;
    }
    
    public Subject(String name, String subid, int maxMarks, double marksObtain){
       setMaxMarks(100);
       setMarksObtain(0);
        this.name = name;
        this.subId = subid;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }
    public String toString(){
        return "\nSubject ID: "+this.subId+" \nName: "+this.name+"\nMarks Obtained: "+this.marksObtain +"\nMaximum Marks: "+ this.maxMarks;
    }
}

public class StudentSub {
    public static void main(String[] args) {
        Subject subs[]= new Subject[3];
        subs[0] = new Subject();
        subs[1] = new Subject("Algorithims", "A101");
        subs[2] = new Subject("Data Structure", "DS101", 100, 70);
        for(Subject s: subs){
            System.out.println(s);
        }
    }
    
}
