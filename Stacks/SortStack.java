package Stacks;

import java.util.*;

class SortStack {
        public static void main(String[] args) {
            int[] a={5,17,100,11};
            int n=a.length;
            Stack<Integer>st=new Stack<>();
            for(int i=0;i<n;i++){
                st.push(a[i]);
            }

            Stack<Integer>ans=new Stack<>();
            ans=sortStacks(st);
            while(!ans.isEmpty()){
                System.out.print(ans.pop()+" ");
            }
        }

        public static Stack<Integer> sortStacks(Stack<Integer>st){
            if(st.size()<=1){
                return st;
            }
           
            Stack<Integer>st1=new Stack<>();

            int n=st.size();

            for(int i=0;i<n/2;i++){
                st1.push(st.peek());
                st.pop();
            }

            st=sortStacks(st);
            st1=sortStacks(st1);

            return mergeSortedStacks(st,st1);
        }

        public static Stack<Integer> mergeSortedStacks(Stack<Integer>s1,Stack<Integer>s2){
            Stack<Integer>s3=new Stack<Integer>();
            while(!s1.isEmpty() && !s2.isEmpty() ){
                if(s1.peek()<s2.peek()){
                    s3.push(s1.peek());
                    s1.pop();
                }
                else{
                    s3.push(s2.peek());
                    s2.pop();
                }
            }

            while(!s1.isEmpty()){
                s3.push(s1.peek());
                s1.pop();
            }
            while(!s2.isEmpty()){
                s3.push(s2.peek());
                s2.pop();
            }
            Stack<Integer> st4=new Stack<>();
            while(!s3.isEmpty()){
                st4.push(s3.peek());
                s3.pop();
            }
            return st4;
        }
}
