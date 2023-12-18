/*
407630101 侯冠瑜 phone:0935782813
 */
package com.mycompany.finaltest;
class ListNode<T>
{
    private T data;
    ListNode<T> nextNode;
    
    ListNode(T object){
        this(object,null);
    }

    ListNode(T object ,ListNode<T>  node) {
        data = object;
        nextNode = node;
    }
    
    ListNode<T> getNext(){
        return nextNode;
    }
    public T getdata(){
        return data;
    }
}

public class ListTest2 {
    public static void main(String[] args) {
         ListNode lastNode = new ListNode(5);    
         ListNode secondNode = new ListNode(4, lastNode);    
         ListNode firstNode =  new ListNode(3, secondNode);   
         
         ListNode current = firstNode;      

         while (current != null)      
         {         
             System.out.printf("%d ", current.getdata());        
             current = current.getNext();    
         }

    }
}
