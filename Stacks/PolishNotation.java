package Stacks;

import java.util.Stack;

public class PolishNotation {
    
    public static void main(String[] args) {
        //String arr[]={"4","13","5","/","+"};
        String arr[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(arr));
    }

    public static int evalRPN(String[] tokens){
        int n=tokens.length;
        Stack<String>st=new Stack<>();

        for(int i=0;i<n;i++){
            if(tokens[i]!="+" && tokens[i]!="-" && tokens[i]!="*" && tokens[i]!="/" ){
                st.push(tokens[i]);
            }
            else{
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                int ans=evaluate(a,b,tokens[i]);
                st.push(Integer.toString(ans));
            }
        }

        return Integer.parseInt(st.pop());
    }

    public static int evaluate(int a,int b,String operator){
        if(operator.equals("+")){
            return a+b;
        }
        else if(operator.equals("-")){
            return b-a;
        }
        else if(operator.equals("/")){
            int ans=  b/a;
            return ans;
        }
        else{
            return a*b;
        }
    }
}
