package BackTracking;

class PrintDigits{
    /****Question****
        Given N digits , print all n digit numbers formed only by 1 and 2 in increasing order.
     */

    public static void main(String[] args){
        int n=3;
        int arr[]=new int[n];
        int i=0;

        printAll(arr,i,n);
    }

    public static void printAll(int arr[],int i,int n){
        //base condition

        if(i==n){
            for(int j=0;j<n;j++){
                System.out.print(arr[j]);
                
            }
            System.out.println();
            return ;
        }

        //if we are @ ith index we have 2 choices either add 1 or 2

        arr[i]=1;
        printAll(arr,i+1,n);
        arr[i]=2;
        printAll(arr,i+1,n);
    }
}