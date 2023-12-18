/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz1;

import java.util.ArrayList;

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
