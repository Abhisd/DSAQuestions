package Tries;

import java.util.*;


//Question: Given a N words of a dictionary and Q Query words,
//check whether query words are present in dictionary or not.
//TC=O(N*L)  N:number of words in Dictionary
//           L:length of a word
//SC is <= N*L because we are saving some space using Trie.

class TrieImpl{
//Node structure of a trie
    static class Node{
         boolean isEnd;
         HashMap<Character,Node>hm=new HashMap<>();
        public Node(){
            isEnd=false;
        }
    }


    public static void main(String args[]){
        String[] words={"hat","cat","bat","rat"};
        String[] findWords={"car","cat","rat","ball"};

        searchWordsInDictionary(words,findWords);
    }

    public static void searchWordsInDictionary(String[] words,String[] findWords){
        int n=words.length;
        int q=findWords.length;

        String[] ans=new String[q];
        Node root=new Node();

        for(int i=0;i<n;i++){
            String word=words[i];

            insertWord(root,word);  
        }

        for(int i=0;i<q;i++){
            String word=findWords[i];

            if(search(root,word)){
                ans[i]="found";
            }
            else{
                ans[i]="NotFound";
            }
        }

        for(int i=0;i<q;i++){
            System.out.print(findWords[i]+":"+ans[i]+" ");
        }
    }

    //inserting each char of word into the trie with respect to root using hashmap
    //Why HashMap over Node arr[26]?
    //becasue every time we are not going to use each array element as a node in trie
    //so to save the some extra space we are using HashMap over arr[26].
    //for binary number related problems we can use array over Hashmap
    //because for binary we will only have arr[2] and Hashmap have key value pair 
    //so it will be convienient to use Array[2] over Hashmap in such a problems
    public static void insertWord(Node root,String word){     
        Node t=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            if(t.hm.containsKey(ch)){
                t=t.hm.get(ch);
            }
            else{
                Node nn=new Node();

                t.hm.put(ch,nn);
                t=nn;
            }
        }
        t.isEnd=true;               //isEnd denotes the last char is added as a node 
    }


    //in search method we are finding the word in trie char by char
    //if we found all chars of a word in trie then it means
    //we reached end of the word and for it we have assigned isEnd=true 
    //so we will return isEnd
    //otherwise we will return false.

    public static boolean search(Node root,String word){
        Node t=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(t.hm.containsKey(ch)){
                t=t.hm.get(ch);
            }
            else{
                return false;
            }
        }
        return t.isEnd;
    }
}