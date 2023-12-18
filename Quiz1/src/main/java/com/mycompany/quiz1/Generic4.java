/*
Q2 : Please complete the following program, which has two classes.  
The static generic method add_into is given for arr1 and arr2 to place 
their elements in intlist and doublelist sequentially, respectively. 
Please complete the class A_List with required methods according to the 
statements in the main() method.  
In A_List, an ArrayList elements is used to store elements.

*/
package com.mycompany.quiz1;
import java.util.ArrayList;
public class Generic4 {
    public static void main(String[] args) {
    Integer[] arr1 = { 2, 4, 5, 6, 7, 8, 23, 11};
    Double[] arr2 = { 2.1, 3.2, 4.3, 5.2, 6.4, 3.1};
    A_List<Integer> intList = new A_List<>();
    A_List<Double> doubleList = new A_List<>();
       
    add_into(intList, arr1);  
    intList.display();  // output the elements in intLis
    intList.delete_it(1);  //delete the element at index 1
    intList.display();

    add_into(doubleList, arr2);  
    doubleList.display(); // output the elements in doubleList
    doubleList.delete_it(2.0);  //delete the element at index 
    doubleList.display();
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
        for(int i=0;i<elements.size();i++){
            System.out.print(elements+" ");
        }
    }
    public void add1(T element){
        elements.add(element);
    }

    public void delete_it(T element){
        elements.remove(element);
    }
}
