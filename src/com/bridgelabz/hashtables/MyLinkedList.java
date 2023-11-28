package com.bridgelabz.hashtables;

/*
 *@desc : Data Structure LinkedList Generic Class
 */
public class MyLinkedList <K,V>{
    public  MyMapNode<K,V> head;
    /*
     *@desc : add the new node at the end of linked list
     *@params : Generic data
     *@return :
     */
    public void append(K key , V value){
        MyMapNode<K,V> newNode = new MyMapNode<>(key , value);
        if(head == null){
            head = newNode;
            return;
        }
        MyMapNode<K,V> temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    /*
     *@desc : search the particular value in the linked list present or not
     *@params : Generic value
     *@return : boolean that it is present in linked list or not
     */
    public MyMapNode<K,V> search(K key){
        MyMapNode<K,V> temp = head;
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    /*
     *@desc : prints the linked list
     *@params :
     *@return :
     */
    public void display(){
        MyMapNode<K,V> temp = head;
        while (temp!=null){
            System.out.print("(" + temp.key + " - " + temp.value +")  -->  ");
            temp=temp.next;
        }
        System.out.println(" null");
    }
}
