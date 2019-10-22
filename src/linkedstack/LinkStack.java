/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedstack;

/**
 *
 * @author PC
 */
public class LinkStack<T> {
    
    private int count;
    private LinearNode<T> head;
    
    public LinkStack() {
        this.count = 0;
        this.head = null;
    }
    
    public void push(T element){
        LinearNode<T> node = new LinearNode(element);
        
        node.setNext(head);
        head=node;
        count++;
        
        
    }
    
    public T pop(){
        
        LinearNode temp = head;
        
        head = head.getNext();
        count--;
        return (T) head.getElement();
        
    }
    
    public void peek(){
        if( head == null){
            System.out.println("Lista Vazia");
        }else{
        
        System.out.println(head);
        }
    }    
    
    public boolean isEmpty(){
        
       if(head == null){
           System.out.println("Lista vazia");
           return true;
       }else{
           System.out.println("Lista contem elementos");
           return false;
       }
       
    }
    
    public int size(){
        return count;
    }
    

    
}
