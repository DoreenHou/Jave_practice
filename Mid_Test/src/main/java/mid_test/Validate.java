package mid_test;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("f:");
        String f=scanner.nextLine();
        System.out.println("l:");
        String l=scanner.nextLine();
        System.out.println("a:");
        String a=scanner.nextLine();
        System.out.println("c:");
        String c=scanner.nextLine();
        System.out.println("s:");
        String s=scanner.nextLine();
        System.out.println("z:");
        String z=scanner.nextLine();
        System.out.println("p:");
        String p=scanner.nextLine();
        
        if(!ValidateInput.f(f))
            System.out.println("error f");
        else if(!ValidateInput.l(l))
            
     
    }
}
