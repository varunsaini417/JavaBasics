package dynamicdipatch;

class Super{
    public void method1(){
        System.out.println("Super mth1");
    }
    
    public void method2(){
        System.out.println("Super mth2");
    }
}

class Sub extends Super{
    
    @Override
    public void method2(){
        System.out.println("Sub meth2");
    }
    
    public void method3(){
        System.out.println("Sub meth3");
    }
}

public class DynamicDipatch {

    public static void main(String[] args) {
        
        Super s = new Super();
        s.method1();
        s.method2();
        System.out.println("\n");
        Sub sb= new Sub();
        sb.method1();
        sb.method2();
        sb.method3();
        
        System.out.println("\n");
        Super sdd = new Sub();
        sdd.method1();
        sdd.method2();
        
    }
    
}
