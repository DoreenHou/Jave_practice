/*
407630101 侯冠瑜 phone:0935782813
 */
package com.mycompany.finaltest;
import java.util.ArrayList;
public class ListTest2 {
    public static void main(String[] args) {
        Integer[] e_array = { 2, 4, 5, 6, 7, 8, 23, 11};
        Double[] arr2 = { 2.1, 3.2, 4.3, 5.2, 6.4, 3.1};
        
         e_array.add(0, e_array.get(e_array.size()-1));
        e_array.remove(e_array.get(1));
        e_array.add(e_array.size()-1,e_array.get(1));
        e_array.remove(e_array.get(2));
    }
   
 }
