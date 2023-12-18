/*
Q2 : Please complete the following program, which has two classes.  
The static generic method add_into is given for arr1 and arr2 to place 
their elements in intList and doubleList sequentially, respectively.  
Please complete the class A_List with required methods according 
to the statements in the main() method.  
In A_List, an ArrayList e_array is used to store elements.
 */
package com.mycompany.test1;
import java.util.ArrayList;
class A_List<T extends Comparable<T>>  
{
    private final ArrayList<T> e_array; // ArrayList stores list elements
    
    public A_list(){
       this(10);
    }
    public A_list(int capacity){
        int initCapacity = capacity > 0 ? capacity : 10;
        e_array = new ArrayList<T>(initCapacity);
    }
    
    public void display() {
	System.out.printf(" "+"%s\n",e_array);
    }
    public void add1(T element){
        e_array.add(element);
    }
    public void find_print_max() {
	T max =e_array.get(0);
	for(T i:e_array){
            if(i.compareTo(max)>0){
            max=i;
            }
	System.out.println("Max= "+max+"\n");
        }
   
    }
}
public class Generic2 {
    public static void main(String[] args) {
      Integer[] arr1 = { 2, 4, 5, 6, 7, 8, 23, 11};
      Double[] arr2 = { 2.1, 3.2, 4.3, 5.2, 6.4, 3.1};
      
      A_List<Integer> intList = new A_List<>();
      A_List<Double> doubleList = new A_List<>();
            
      add_into(intList, arr1);  
      intList.display();    // output the elements in intList
      intList.find_print_max();  // find and print the maximum value in intList
      add_into(doubleList, arr2);  
      doubleList.display();   // output the elements in doubleList
      doubleList.find_print_max();   // find and print the maximum value in 
// doubleList
    }
public static <T extends Comparable<T>> void add_into(A_List<T> list1, T[] elements)
   {
      for (T element : elements)
        list1.add1(element);
   } 
}

