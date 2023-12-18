
package com.deitel.datastructures;

import java.util.NoSuchElementException;
public class Stack<T> {
    private List<T> stackList;
    
    public Stack(){
        stackList = new List<T>("stack");
    }
    
    public void push(T object){
        stackList.insertAtFront(object);
    }
    
    public T pop() throws NoSuchElementException{
        return stackList.removeFromFront();
    }
    
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
    
    public void print(){
        stackList.print();
    }
}
