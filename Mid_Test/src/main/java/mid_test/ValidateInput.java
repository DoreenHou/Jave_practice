 package mid_test;

public class ValidateInput {
    public static boolean f (String f){
        return f.matches("[A-Z]+[a-zA-Z]*");
    }
    public static boolean l (String l){
        return l.matches("[a-zA-Z]+(['-][a-zA-Z]+)");
    }public static boolean a (String a){
        return a.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }public static boolean c (String c){
        return c.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }public static boolean s (String s){
        return s.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }public static boolean z(String z){
        return z.matches("\\d{5}");
    }public static boolean p (String p){
        return p.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
