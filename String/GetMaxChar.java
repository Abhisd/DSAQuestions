package String;

public class GetMaxChar {
    /*
     * Given a string, find the maximum occured charcter in string
     * if there are more than 1 chars as an answer then we need to
     * return lexicographically smaller char.
     * ex. test
     * ans- t 2 times.
     * ex. testsample
     *      t 2
     *      e 2
     *      s 2
     * ans=e
     */
    public static void main(String[] args) {
        String str="testsample";
        System.out.println("max occured char in a given string: "+maxOccuredChar(str));
        //maxOccuredChar(str);
    }

    public static char maxOccuredChar(String s){
        int n=s.length();
        int arr[]=new int[26];  //to store occurance of each char from a-z

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int number=0;
            if(ch>='a' && ch<='z'){
                number=ch-'a';
                //arr[number]++;
            }
            else{
                number=ch-'A';
                
            }
            arr[number]++;
        }
        
        int maxi=-1,ans=0;

        for(int i=0;i<16;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
                ans=i;
            }
        }
        char result=(char)(ans+ 'a');
        return  result;
    }
}
