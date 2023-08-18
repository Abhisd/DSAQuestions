package String;

 class CheckPalindrome {
    //check if a given string is palindrome
    //ignore numbers and whitespace from the string
    //ex= a1b 34b8a -> true
    public static void main(String[] args) {
        String str= "a1b34b8a1";
        int n=str.length();
        System.out.println(checkPal(str,n));
    }
    public static boolean checkPal(String str,int n){

        int i=0;
        int j=n-1;

        while(i<j){
            char front=str.charAt(i);
            char back=str.charAt(j);
            if (front == ' ' || (front >= '0' && front <= '9')) {
                i++;
            }
            if (back == ' ' || (back >= '0' && back <= '9')) {
                j--;
            }
            front=str.charAt(i);
            back=str.charAt(j);
            if((front>='a' && front<='z') && front!=' ' && front!=back){
                
                return false;
            }
            else{
                if (front == ' ' || (front >= '0' && front <= '9')) {
                    i++;
                }
                if (back == ' ' || (back >= '0' && back <= '9')) {
                    j--;
                }
               
                i++;
                j--;

            }
        }
        return true;

    }

    

}
