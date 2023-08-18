package String;

public class PermutationInString {
    /*
     * Given two strings s1 and s2, return true if s2
     * contains a permutation of s1,
     * or false otherwise.
     * 
     * In other words, return true if one of s1's
     * permutations is the substring of s2.
     * 
     * ex= s1="ab", s2="eidbaooo"
     * ans=true
     * s2 contains permutatation of s1-"ba"
     */
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidboaoo";

        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1,String s2){
        int m=s1.length();
        int n=s2.length();

        //create charcounter array for s1
        int[] count1=new int[26];
        for(int i=0;i<m;i++){
            char ch=s1.charAt(i);
            count1[ch-'a']++;
        }

        //now we will traverse s2 for window size s1.length

        int i=0;
        int window=m;

        int[] count2=new int[26];

        while(i<window && i<n){
            char ch=s2.charAt(i);
            count2[ch-'a']++;
            i++;
        }

        if(check(count1, count2)){
            return true;
        }

        //now we will check for nexi windows

        while(i<n){
            char newChar=s2.charAt(i);
            int index=newChar-'a';
            count2[index]++;

            char oldChar=s2.charAt(i-window);
            index=oldChar-'a';
            count2[index]--;

            i++;

           if(check(count1, count2)) return true; 
        }
        return false;
    }

    public static boolean check(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
