package Stacks;

import java.util.*;
class ValidParenthesis{
    public static void main(String[] args){
        //check if the given string is valid parethesis or not
        String s="({[]})";  //"("

        if(checkParenthesis(s)==true){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("not valid Parentheasis");
        }
    }

    public static boolean checkParenthesis(String s){
        int n=s.length();
        Stack<Character>st=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    char top=st.peek();

                    if((ch==')'&& top=='(') || (ch==']'&& top=='[') || (ch=='}'&& top=='{')){
                        st.pop();
                    }
                    
                   else{
                        return false;
                   } 
                    
                }
                else{
                    return false;
                }
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}