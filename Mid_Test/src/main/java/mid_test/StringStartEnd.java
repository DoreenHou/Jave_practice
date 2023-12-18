
package mid_test;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings={"started","staring","ended","ending"};
        for(String string :strings)
        {
            if(string.startsWith("st"))
                System.out.printf("%s start with st",string);
        }
        for(String string :strings)
        {
            if(string.startsWith("art",2))
                System.out.printf("%s start with art",string);
        }
        for(String string :strings)
        {
            if(string.endsWith("ed"))
                System.out.printf("%s end with ed",string);
        }
    }
    
}
