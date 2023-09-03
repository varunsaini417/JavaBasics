import java.util.*;
public class MenuArithematic {
    public static void main(String[] args){
        int choice = 0;
        System.out.println("Wlecome to this Arithematic calculator.");
        System.out.println("We have various options for Arithematic: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Miltiplication");
        System.out.println("4. Division");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        long num1, num2;
        System.out.println("Enter two numbers");
        num1= sc.nextLong();
        num2=sc.nextLong();
        
        switch (choice){
            case 1:
                add_two_numbers(num1,num2);
                break;
            case 2:
                sub_two_numbers(num1,num2);
                break;
            case 3:
                multip_two_numbers(num1,num2);
                break;
            case 4:
                divide_two_numbers(num1,num2);
                break;
        }
    }
    
    public static void add_two_numbers(long num1, long num2){
        System.out.println("Sum is "+ (num1+num2));
    }
    public static void sub_two_numbers(long num1, long num2){
        System.out.println("Subtraction  is "+ (num1-num2));
    }
    public static void multip_two_numbers(long num1, long num2){
        System.out.println("Multiplication is "+ (num1*num2));
    }
    public static void divide_two_numbers(long num1, long num2){
        System.out.println("Division is "+ (num1/num2));
    }
}
