package com.bridgelabz.hashtables;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing Hash tables");
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String [] words = sentence.toLowerCase().split(" ");
        MyHashMap<String , Integer> frequencyOfWord = new MyHashMap<>();
        for(String word : words){
            Integer wordFrequency = frequencyOfWord.get(word);
            if(wordFrequency == null){
                wordFrequency = 1;
            }
            else {
                wordFrequency++;
            }
            frequencyOfWord.add(word , wordFrequency);
        }
        frequencyOfWord.display();
    }
}
