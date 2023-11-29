package com.bridgelabz.hashtables;
/*
    @desc : MyHashMap Generic Class implementing get , add , remove , display method for hashmap
 */
public class MyHashMap <K ,V>{
    // bucket linked list size
    private static final int SIZE = 10;
    MyLinkedList<K,V> [] myMapNodeLinkedList;
    // hasmap constructor to initialize bucket of linked list
    public MyHashMap(){
        this.myMapNodeLinkedList = new MyLinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            myMapNodeLinkedList[i] = new MyLinkedList<>();
        }
    }
    /*
        @desc : using hashcode get the index of the bucket according to key
        @params : Generic key
        @return : value to particular generic key
     */
    public V get(K key){
        int hashCode = Math.abs(key.hashCode())%SIZE;
        MyMapNode<K,V> myMapNode = this.myMapNodeLinkedList[hashCode].search(key);
        return myMapNode == (null) ? null : myMapNode.getValue();
    }
    /*
        @desc : using hashcode get the index of the bucket according to key and add it to the linked list
        @params : Generic key and value
        @return :
     */
    public void add(K key , V value){
        int hashCode = Math.abs(key.hashCode())%SIZE;
        MyMapNode<K,V> myMapNode = this.myMapNodeLinkedList[hashCode].search(key);
        if(myMapNode == null){
            this.myMapNodeLinkedList[hashCode].append(key , value);
        }
        else{
            myMapNode.setValue(value);
        }
    }
    /*
        @desc : remove the particular key value from hashmap
        @params : Generic key
        @return :
     */
    public void remove(K key){
        int hashCode = Math.abs(key.hashCode())%SIZE;
        this.myMapNodeLinkedList[hashCode].remove(key);
    }
    /*
        @desc : prints the hashmap in structured manner
        @params :
        @return :
     */
    public void display(){
        for(int i=0;i<SIZE;i++){
            System.out.print("Index : "+i+"  -> ");
            MyMapNode<K,V> temp = this.myMapNodeLinkedList[i].head;
            while (temp!=null){
                System.out.print("(" + temp.key + " - " + temp.value +")  -->  ");
                temp=temp.next;
            }
            System.out.println(" null");
        }
    }
}