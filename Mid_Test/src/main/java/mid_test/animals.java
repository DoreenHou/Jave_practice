package mid_test;
/*
2. Please complete the following java program in which a bird (a1) and a frog (a2) 
move from their initial location along the x-axis.  
The initial location of a1 is 5 and theinitial location of a2 is 8.  
Bird flies 30 feet in a move and frog jumps 10 feet in a move.  
In this case, the final location of a1 is 5+30 and that of a2 is 8+10. 
Please use a method “move” to do the movement and output their final location along x-axis. 
public class animals { 
    public static void main(String[] args)  {          
    Animal a1 = new Bird(5);   // 5 is the initial location of a1         
    Animal a2 = new Frog(8);  // 8 is the initial location of a2
         .    .   .         
    // a1 and a2 move here       
    // output the final location of a1 and a2 here            
    } 
}  
abstract class Animal {  
    private int location_x;  //location on x-axis   
    public Animal(int a)     { 
        location_x = a; 
    }   
    public abstract void move( ); 
    .    .    .
} 
class Bird extends Animal{  .  .   . }
class Frog extends Animal{  .   .   .}
 */

public class animals {
    public static void main(String[] args)  {          
    Animal a1 = new Bird(5);   // 5 is the initial location of a1         
    Animal a2 = new Frog(8);  // 8 is the initial location of a2
     a1.move();
     a2.move();
     a1.print_x();
     a2.print_x();
    // a1 and a2 move here       
    // output the final location of a1 and a2 here            
    }
}
abstract class Animal {  
    private int location_x;  //location on x-axis   
    public Animal(int a)     { 
        this.location_x = a; 
    }   

    public int getLocation_x() {
        return location_x;
    }

    public void setLocation_x(int location_x) {
        this.location_x = location_x;
    }
    
    public abstract void move( );
    public void print_x(){
        System.out.printf("final location:%d",getLocation_x());
    }
}
class Bird extends Animal{  

    public Bird(int location_x) {
        super(location_x);
    }
    @Override
    public void move(){
        setLocation_x(30);
    }
}
class Frog extends Animal{

    public Frog(int location_x) {
        super(location_x);
    }
    @Override
    public void move(){
        setLocation_x(10);
    }

}