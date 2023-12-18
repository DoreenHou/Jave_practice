package mid_test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZeroWithExceptionHandling {
    
        
        public static int quo(int up,int down)
        throws ArithmeticException
        {
            return up/down;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean con=true;
        
        do
        {
            try{
                System.out.println("enter up:");
                int up=scanner.nextInt();
                System.out.println("enter down");
                int down=scanner.nextInt();
                int result=quo(up,down);
                System.out.printf("the result:%d",result);
                con=false;
            }catch(InputMismatchException inputMismatchException){
                System.err.printf("Exception: %s",inputMismatchException);
                scanner.nextLine();
                System.out.println("Invaild input.try again.");
                
            }catch(ArithmeticException arithmeticException){
                System.err.printf("Exception :%s",arithmeticException);
                System.out.printf("error");
            }
    
        }while(con);
    }
}
