
package com.deitel.datastructures;
import java.util.NoSuchElementException;
public class Queue<T> {
    private List<T> queueList;

    public Queue() {
        queueList = new List<T>("queue");
    }
    
    public void enqueue(T object){
        queueList.insertAtBack(object);
    }
    public T dequeue() throws NoSuchElementException{
        return queueList.removeFromFront();
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    
    public void print(){
        queueList.print();
    }
}
