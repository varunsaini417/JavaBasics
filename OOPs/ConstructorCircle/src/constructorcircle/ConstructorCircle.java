
package constructorcircle;


class Rectangle{
    private double length;
    private double width;
    
    private void setLength(double l){
        this.length = l;
    }
    private void setWidth(double w){
        this.width = w;
    }
    
    private double getLength(double l){
        return this.length;
    }
    
    private double getWidth(double l){
        return this.width;
    }
    
    public Rectangle(){
        this.length =1;
        this.width=1;
    }
    public Rectangle(double l, double w){
        setLength(l);
        setWidth(w);
    }
    
    public Rectangle(double s){
        length=width=s;
    }
    
    public void area(){
        System.out.println(this.length*this.width);
    }
}
public class ConstructorCircle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5);
        r.area();
    }
    
}
