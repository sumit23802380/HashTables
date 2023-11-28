package com.bridgelabz.hashtables;

public class MyHashMap <K ,V>{
    private static final int SIZE = 10;
//    MyMapNodeLinkedList<K,V> [] myMapNodeLinkedList;
    MyLinkedList<K,V> [] myMapNodeLinkedList;
    public MyHashMap(){
        this.myMapNodeLinkedList = new MyLinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            myMapNodeLinkedList[i] = new MyLinkedList<>();
        }
    }

    public V get(K key){
        int hashCode = Math.abs(key.hashCode())%SIZE;
        MyMapNode<K,V> myMapNode = this.myMapNodeLinkedList[hashCode].search(key);
        return myMapNode == (null) ? null : myMapNode.getValue();
    }
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