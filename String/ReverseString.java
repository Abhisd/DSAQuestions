package String;

 class ReverseString {
    public static void main(String[] args) {
        String s="InterviewBit";
        StringBuilder str=new StringBuilder(s);
        reverse(str);
    }
    public static void reverse(StringBuilder s){
        int n=s.length();
        int i=0,j=n-1;

        while(i<=j){
            char a=s.charAt(i);
            char b=s.charAt(j);
            swap(s,a,b);
            i++;
            j--;
        }

        System.out.println(s);
    }
    public static void swap(StringBuilder s,char a,char b){
        char t=a;
        a=b;b=t;
    }
}
