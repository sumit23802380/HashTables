package com.bridgelabz.hashtables;

public class MyHashMap <K ,V>{
//    MyMapNodeLinkedList<K,V> [] myMapNodeLinkedList;
    MyLinkedList<K,V> myMapNodeLinkedList;
    public MyHashMap(){
        this.myMapNodeLinkedList = new MyLinkedList<>();
    }
    public V get(K key){
        MyMapNode<K,V> myMapNode = this.myMapNodeLinkedList.search(key);
        return myMapNode == (null) ? null : myMapNode.getValue();
    }
    public void add(K key , V value){
        MyMapNode<K,V> myMapNode = this.myMapNodeLinkedList.search(key);
        if(myMapNode == null){
            this.myMapNodeLinkedList.append(key , value);
        }
        else{
            myMapNode.setValue(value);
        }
    }
}