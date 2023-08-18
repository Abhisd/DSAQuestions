package Heaps;

import java.util.*;
class MishaAndCandies{
    public static void main(String args[]){
        int arr[]={9, 818 ,174, 237 ,892 ,109 ,522 ,27 ,59 ,336 ,605 ,865 ,714 ,86 ,708 ,535 ,138,
         948, 836, 287, 179, 754, 466, 856, 153, 53, 958, 951, 262, 341, 769, 491, 772,
         509, 336, 120, 98, 805, 169, 984, 520, 447, 256, 266, 348, 351 ,60 ,563 ,45 ,638, 29, 479, 400};
       // 9, 818 ,174, 237 ,892 ,109 ,522 ,27 ,59 ,336 ,605 ,865 ,714 ,86 ,708 ,535 ,138,
         //948, 836, 287, 179, 754, 466, 856, 153, 53, 958, 951, 262, 341, 769, 491, 772,
         //509, 336, 120, 98, 805, 169, 984, 520, 447, 256, 266, 348, 351 ,60 ,563 ,45 ,638, 29, 479, 400
        int B=852;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        
            
        while(!pq.isEmpty()){
            int top=pq.remove();
            System.out.println(top);
            // if(top<=B){
                
            //     int half=(int)Math.floor(top/2);
            //     ans+=half;
            //    // System.out.println("first:"+top +"Half:"+half);
            //     if(!pq.isEmpty()){
            //          int t=pq.remove();
            //          pq.add(t+half);
            //         // System.out.println("first:"+t +"Half:"+half);
            //     }
               
            // }
        
        }

        //System.out.println(ans);
    }
}