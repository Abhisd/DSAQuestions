class LPSString{
    public static void main(String args[]){
        String s="abadabae";

        getLPS(s);
    }

    public static void getLPS(String s){
        int n=s.length();
        int LPS[]=new int[n];
        LPS[0]=0;

        for(int i=1;i<n;i++){
            int x=LPS[i-1];
            while(s.charAt(i)!=s.charAt(x)){
                if(x==0){
                    x=-1;
                    break;
                }
                x=LPS[x-1];
            }

            LPS[i]=x+1;
        }

        for(int i=0;i<n;i++){
            System.out.print(LPS[i]+" ");
        }
    }
}