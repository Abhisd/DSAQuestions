 class sortedRotatedArray {
    public static void main(String[] args) {
        //given rotated sorted array and the target k find the index of k in an array
        //return index, if not present return -1.
        //int[] a={4,7,9,67,90}; //{4,5,6,7,0,1,2,3};
        int[] a={1,7,67,133,178};
       // int[] a={192,194,197,198,199,200,201,203,204,2,3,4,7,9,10,11,14,15,16,17,20,21,22,23,24,25,26,27,28,29,30,33,34,35,36,39,40,42,43,46,47,50,51,52,53,55,57,59,60,64,66,68,70,71,72,75,76,78,85,86,87,91,92,94,95,96,99,102,105,106,107,109,111,113,114,115,119,120,121,123,125,129,130,131,133,134,137,138,139,140,141,142,143,145,146,149,151,152,156,160,161,165,167,168,170,171,176,177,178,179,180,181,182,185,186,190};
        int k=1;
        int n=a.length;
        //idea :
        //first find the pivot index.
        int pivot=findPivot(a,0,n-1);
        System.out.println("Pivot is "+pivot);
        int index=0;
        if(pivot==n-1){
            index= search(a, 0, n-1, k);
        }
        if(k>=a[pivot] && k<=a[n-1]){
            index=search(a, pivot,n-1, k);
        }
        else{
            index=search(a,0,pivot-1,k);
        } 
        System.out.println(index);

    }
    public static int search(int[]a,int low,int high,int k){

       // if(low>high)return -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==k){
                return mid;
            }
            if(a[mid]>k){
                high=mid-1;
            }
            if(a[mid]<k){
                low=mid+1;
            }
                
            
        }
       return -1;
    }
    public static int findPivot(int[]  a,int l,int h){
       int s=l;
       int e=h;
       int ans=-1;
       while(s<e){
        int mid=s+(e-s)/2;

        if(a[mid]>a[0]){
            s=mid+1;
        }
        else{
            e=mid;
        }
       }
       return ans=s;
        
        
       // return -1;
    }
}
