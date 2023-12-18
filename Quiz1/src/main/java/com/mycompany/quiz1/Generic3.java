
package com.mycompany.quiz1;
/*
Q1 : Please complete the following program, which has only one class.  
Please store the elements in array a in array iarr, 
and store the elements in array d in array darr, sequentially.  
Finally, give a generic method for iarr and darr to 
find and print the maximum value in iarr and the darr. 

*/

public class Generic3 {
    public static void main(String[] args) {
        String[] a = {"12", "33", "45", "23"};
        String[] d = {"12.3", "33.5", "7.3" , "5.3", "43.5", "54.2"};     
        Integer[] iarr = new Integer[a.length];
        Double[] darr = new Double[d.length];
     
        for(int i=0;i<iarr.length;i++){
            int num =Integer.parseInt(a[i]);
            iarr[i]=num;
        }
         for(int i=0;i<darr.length;i++){
            double num =Double.parseDouble(d[i]);
            darr[i]=num;
        }
        System.out.println(find_max(iarr));
        System.out.println(find_max(darr));
    }

    public static <T extends Comparable<T>> T find_max(T[] list){
    
        T max=list[0];
	for(T i:list){
            if(i.compareTo(max)>0){
            max=i;
            }
	
        }
        return max;
    }
    
}



