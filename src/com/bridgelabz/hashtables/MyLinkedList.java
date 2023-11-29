package com.bridgelabz.hashtables;

/*
 *@desc : Data Structure LinkedList Generic Class
 */
public class MyLinkedList <K,V>{
    public  MyMapNode<K,V> head;
    /*
     *@desc : add the new node at the end of linked list
     *@params : Generic key and value
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
     *@desc : search the particular value in the linked list
     *@params : Generic key
     *@return : mapnode if key exists else null
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
     *@desc : deletes the particular key if it is present in linked list
     *@params : Generic key
     *@return :
     */
    public void remove(K key){
        if(head.key.equals(key)){
            head = head.next;
            return;
        }
        MyMapNode<K,V> temp = head;
        while(temp.next!=null){
            if(temp.next.key.equals(key)){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
    /*
        @desc : prints the linked-list
        @params :
        @return :
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
