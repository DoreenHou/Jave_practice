package com.mycompany.test1;
import java.util.ArrayList;
public class generic1 {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6};
        double[] d = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Integer[] iarr = new Integer[a.length];
        Double [] darr = new Double[d.length];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        
        for(int i=0;i<iarr.length;i++){
            iarr[i]=a[i];          
        }
        for(int i=0;i<darr.length;i++){
            darr[i]=d[i];
        }
        
        
        place_in(iarr,list1);
        printArray(list1);
        place_in(darr,list2);
        printArray(list2);
        
    }
    public static <T> void place_in(T[] i,ArrayList<T> list1){
        for(int element=0;element<i.length;element++){
            list1.add(i[element]);
        }
    }
    public static <T> void printArray(ArrayList<T> list){
        
        System.out.printf("%s :", list);
        for (T element : list)
            System.out.printf("%s  ",element);
        
        System.out.println();
    }  
}
