
package com.mycompany.finalquiz;

import java.util.ArrayList;

public class Generic4 {
    public static void main(String[] args) {
        String[] a = {"12", "33", "45", "23"};
        String[] d = {"12.3", "33.5", "7.3" , "5.3", "43.5", "54.2"};     
        Integer[] arr1 = new Integer[a.length];
        Double[] arr2 = new Double[d.length];

        A_List<Integer> intList = new A_List<>();
        A_List<Double> doubleList = new A_List<>();
       
        

        add_into(intList, arr1);  
        intList.display();// output the elements in intList
        intList.delete_it(1);  //delete the element at index 1
        intList.display();  // display elements in intList

        add_into(doubleList, arr2);  
        doubleList.display(); // output the elements in doubleList
        doubleList.delete_it(2);  //delete the element at index 2
        doubleList.display();  // display elements in intList

    }
    public static <T extends Comparable<T>> void add_into
    (A_List<T> list1, T[] elements)
    {
        for (T element : elements)
        list1.add1(element); 
    } 
}
class A_List<T extends Comparable<T>>  
{
  　private final ArrayList<T> elements; // ArrayList stores list elements
    public A_list(){
       this(10);
    }
    public A_list(int capacity){
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initCapacity);
    }
    public void display() {
        System.out.println(" " +elements+" \n");
        
    }
    public void add1(T element){
        elements.add(element);
    }

    public void delete_it(T element){
        elements.remove(element);
    }
　　　
}


