package String;

import java.util.*;
 class ReverseVowel {
    public static void main(String[] args) {
        String s="Hello";

        StringBuilder str=new StringBuilder(s);
        System.out.println(reverse(str));
    
    }

    public static String reverse(StringBuilder s){
        int n=s.length();
        int i=0;
        int j=n-1;

        while(i<j){
            char front=s.charAt(i);
            char back=s.charAt(j);
            if(isVowel(front) && isVowel(back)){
                swap(s,front,back);
                i++;
                j--;

            }

            if(isVowel(front)==true && isVowel(back)==false){
                j--;
            }

            if(isVowel(front)==false && isVowel(back)==true){
                i++;
            }
        }

        return s.toString();
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }

        return false;
    }

    public static void swap(StringBuilder s, char a, char b){
        char t=a;
        a=b;
        b=t;
    }
}
