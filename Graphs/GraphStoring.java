package Graphs;

import java.util.*;
class GraphStoring{

    public static void main(String[] args){
        //Adjacency matrix
        // Scanner sc=new Scanner(System.in);
        // int n=5;//sc.nextInt();     //Number of Nodes
        // int e=6;//sc.nextInt();     //Number of Edges

        // int[][] adjMat=new int[n+1][n+1];    //n+1 because of 1 based indexing

        // for(int i=0;i<e;i++){
        //     int u=sc.nextInt();
        //     int v=sc.nextInt();

        //     adjMat[u][v]=1;
        //     adjMat[v][u]=1;
        // }

        // for(int i=0;i<adjMat.length;i++ ){
        //     for(int j=0;j<adjMat[0].length;j++){
        //         System.out.print(adjMat[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //Adjacency List
        ArrayList<ArrayList<Integer>>adjList=new ArrayList<>();
        int n=3,e=3;
        for(int i=1;i<=n;i++){
           // adjList.add(new ArrayList<Integer>());
            
            adjList.get(1).add(2);
            adjList.get(2).add(1);

            adjList.get(2).add(3);
            adjList.get(3).add(2);

            adjList.get(1).add(3);
            adjList.get(3).add(1);
        }

        for(int i=1;i<=n;i++){
            for(int j=0; j<=adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

//Why to use Adjecency List over Adjecency Matrix??
//Space Complexity for Matrix=O(n*n)
//Space Complexity for List=O(2*e)
// so by using the list we save lot of extra space which gets wasted using matrix.