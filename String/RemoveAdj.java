package String;

import java.util.Stack;

public class RemoveAdj {
    /*
     * You are given a string s consisting of lowercase
     * English letters. A duplicate removal consists of
     * choosing two adjacent and equal letters and removing
     * them.
     * 
     * We repeatedly make duplicate removals on s until we no
     * longer can.
     * 
     * Return the final string after all such duplicate
     * removals have been made. It can be proven that the
     * answer is unique.
     */
    public static void main(String[] args) {
            String s="azxxzy";    //abbaca

            System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s){

        int n=s.length();

        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));

        for(int i=1;i<n;i++){
            char ch=s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }

        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }

        str.reverse();
        return str.toString();
    }
}
