package abstractclass;

abstract class Shape{
    abstract public void area();
    abstract public void perimeter();
    
}

class Circle extends Shape
{
    @Override
    public void area(){
        System.out.println("area");
    }
    @Override
    public void perimeter(){
        System.out.println("Permiter");
    }
}

class Rectangle extends Shape{
    @Override 
    public void area(){
        System.out.println("Rectangle's area. ");
    }
    
    @Override 
    public void perimeter(){
        System.out.println("Rectangle's perimeter. ");

    }
}

public class AbstractClass {

    public static void main(String[] args) {
        System.out.println("Hello");
        
        Shape c = new Circle();
        
        c.area();
        c.perimeter();
        System.out.println("\n");
        
        Shape r = new Rectangle();
        r.area();
        r.perimeter();

    }
    
}
