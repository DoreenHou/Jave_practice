package mid_test;
/*
Complete the following program to output the name, every score, and the average score of each student.  
StudentA has two scores and StudentB has 3 scores.   
The output should be like the following :
Mary :   90  and  80,  average is  85
Tom :   78  and  86,  average is  82
Jack :   80  and  88  and  92,  average is  86
interface Average{ int cal_avg();  }          
// calculate the average score
public class TeamTest  {  
    public static void main( String args[] )  {   
        StudentA[] team = new StudentA[3];  
        StudentA a = new StudentA("Mary", 90, 80);  
        StudentA b = new StudentA("Tom", 78, 86);  
        StudentB c = new StudentB("Jack", 80, 88, 92);
        team[0] = a;   
        team[1] = b;  
        team[2] = c;    
        System.out.printf("%s\n", team[0]);  
        System.out.printf("%s\n", team[1]);  
        System.out.printf("%s\n", team[2]);  
        } // end main
    } // end class 
class StudentA implements Average{    
    private String name;  
    private int score1, score2;  
    .    .    .
} 
class StudentB extends StudentA{ 
    private int score3; 
    .    .    .
}
*/

interface Average{ int cal_avg();  }          
// calculate the average score
 public class TeamTest {
    public static void main( String args[] )  {   
        StudentA[] team = new StudentA[3];  
        StudentA a = new StudentA("Mary", 90, 80);  
        StudentA b = new StudentA("Tom", 78, 86);  
        StudentB c = new StudentB("Jack", 80, 88, 92);
        team[0] = a;   
        team[1] = b;  
        team[2] = c;    
        System.out.printf("%s\n", team[0]);  
        System.out.printf("%s\n", team[1]);  
        System.out.printf("%s\n", team[2]);  
        } // end main
}
class StudentA implements Average{    
    public String name;  
    public int score1, score2;
    public int avg;

    public StudentA(String name,int score1,int score2) {
        this.name=name;
        this.score1=score1;
        this.score2=score2;
    }

    public String getName() {
        return name;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
    
    @Override
    public int cal_avg(){
        return (score1+score2)/2;
    }
    public String toString(){
        return this.name+" : "+this.score1+" and "+this.score2+" avg is"+cal_avg();
    }
    
} 
class StudentB extends StudentA{ 
    private int score3;
    private int avg;

    public StudentB(String name,int score1,int score2,int score3) {
        super(name,score1,score2);
        this.score3=score3;
    }

    public int getScore3() {
        return score3;
    }
    
    @Override
    public int cal_avg(){
        return (score1+score2+score3)/3;
    }
    public String toString(){
        return this.name+" : "+this.score1+" and "+this.score2+" and "+this.score3+" avg is"+cal_avg();
    }
}
