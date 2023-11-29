package com.bridgelabz.hashtables;
/*
    *@desc : MyMapNode class that contains constructor , getter and setter for key , value and some other methods
 */
public class MyMapNode <K , V>{
    K key;
    V value;
    MyMapNode<K,V> next;
    /*
        @desc : Constructor to initialize the MyMapNode
        @params :
        @return :
     */
    public MyMapNode(K key , V value){
        this.key = key;
        this.value = value;
        next = null;
    }
    /*
        @desc : method to return the key of map-node
        @params :
        @return : key of generic type
     */
    public K getKey() {
        return key;
    }
    /*
        @desc : method to set the key of map-node
        @params : key that we want to set with
        @return :
     */
    public void setKey(K key){
        this.key = key;
    }
    /*
        @desc : method to return the next map-node
        @params :
        @return : next map-node
     */
    public MyMapNode<K,V> getNext(){
        return next;
    }
    /*
        @desc : method to set the next node
        @params : next map-node
        @return :
     */
    public void setNext(MyMapNode<K , V> next){
        this.next = next;
    }
    /*
        @desc : method to get the value of the node
        @params :
        @return : value of map-node
     */
    public V getValue(){
        return this.value;
    }
    /*
        @desc : method to set the value of map-node
        @params :
        @return :
     */
    public void setValue(V value){
        this.value = value;
    }
}

