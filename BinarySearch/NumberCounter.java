package BinarySearch;

 class NumberCounter {
    public static void main(String[] args) {
        //given sorted binary array count numbers of 1's from the array.
        int[] arr={0,0,0,0};
        int n=arr.length;

        int ans=countOnes(arr,n);
        if(ans==0) System.out.println("no 1's found");
        else{int result=n-ans;
        System.out.println(result);}
    }

    public static int countOnes(int[] arr,int n){
        return binarySearch(arr,0,n-1);
        //return 0;
    }
    public static int binarySearch(int[] arr,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==1 && (mid-1>=0 &&arr[mid-1]==0)){
                return mid;
            }
            else if(arr[mid]==0){
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return 0;
    }
}
