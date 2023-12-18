
package mid_test;

import java.util.Scanner;
import java.util.StringTokenizer;
public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter sentence and press enter:");
        String sentence=scanner.nextLine();
        
        String[] tokens =sentence.split(" ");
        System.out.printf("%nthe number of elemwnts: %d%nthe token are: %n",tokens.length);
        for(String token :tokens)
            System.out.println(token);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter an sentence and press enter.");
        String sentence = scanner.nextLine();
        
        String[] tokens =sentence.split(" ");
        System.out.printf("%nthe number of elemwnts: %d%nthe token are: %n",tokens.length);
        for(String token :tokens)
            System.out.println(token);
    }
*/