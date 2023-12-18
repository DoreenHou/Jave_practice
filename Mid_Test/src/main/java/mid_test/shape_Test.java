package mid_test;
/*
1.Please complete the following Java program to print 
    a.the sum of areas of objects f1 and f2.
    b.The radius of f1 and side length of f2
    public class shape_Test{  
        public static void main( String args[])  { 
        Shape f1 = new Circle(10);  // 10 is radius     
        Shape f2 = new Square(8);  // 8 is side length    
        .   .   .  
        }
    }  
    abstract class Shape {  
        public abstract double area( );
    }  
    class Circle extends Shape{    .   .   .    }      
    class Square extends Shape{    .   .   .    }  
    // Hints :// 
    a. You need private instance variables radius for Circle and side length for Square.// 
    b. You need constructors for them.//
    c. You need concrete method area for Circle and Square.// 
    d. You are not allowed to change class Shape.
*/
public class shape_Test {
    public static void main( String args[])  { 
        Shape f1 = new Circle(10);  // 10 is radius     
        Shape f2 = new Square(8);  // 8 is side len  
        System.out.printf("the sum of f1 and f2: %d", f1.area()+f2.area());
        System.out.printf("r:%d",((Circle)f1).getRadius());
        System.out.printf("l:%d",((Square)f2).getL());
        f1.area();
        f2.area();
        System.out.println(f1.area());
        System.out.println(f2.area());
}
}    
abstract class Shape {  
    public abstract double area( );
}  
class Circle extends Shape{  
    private double radius;
    public Circle(double r) {
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    
    @Override
    public double area(){
        return radius*radius*Math.PI;
    }
    
}      
class Square extends Shape{  
private double l;
    public Square(double l) {
        this.l=l;
    }

    public double getL() {
        return l;
    }
    public double area(){
        return l * l;
    }
      
}

    

