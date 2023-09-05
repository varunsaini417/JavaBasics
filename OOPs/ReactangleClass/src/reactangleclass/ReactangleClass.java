
package reactangleclass;

import java.util.Scanner;


 class Rectangle {
    public double length, breadth;
    
    public double area(){
        return length*breadth;
    }
    
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
}

public class ReactangleClass  {

    public static void main(String[] args) {
        int choice;
        Rectangle r1 = new Rectangle();
        System.out.println("Welcome the Rectangle operations!");
        System.out.println("Enter the lenght and breadth of the rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: "  );
        r1.length = sc.nextDouble();
        System.out.println("Breadth: "  );
        r1.breadth = sc.nextDouble();
        System.out.println("Great!! we got your response!!");
        System.out.println("Now, enter your choice" );
        System.out.println("1: Find Area -> "  );
        System.out.println("2: Find perimeter ->" );
        System.out.println("3: Check Square or not ->" );
        
        choice = sc.nextInt();
        
        switch(choice){
            case 1 :
                System.out.println("The area is: " + r1.area());
                break;
            case 2:
                System.out.println("The perimeter is: " +r1.perimeter());
                break;
            case 3:
                System.out.println("Square or not: " );
                if(r1.isSquare()){
                    System.out.println("Yes it is square");
                }else{
                    System.out.println("No, its not!" );
                }
                break;
        }
        
    }
    
}
