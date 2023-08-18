package String;

public class RemoveFromString {
    /*
     * Given two strings s and part, perform the following operation on s until all
     * occurrences of the substring part are removed:
     * 
     * Find the leftmost occurrence of the substring part and remove it from s.
     * Return s after removing all occurrences of part.
     * 
     * A substring is a contiguous sequence of characters in a string.
     */
   public static void main(String[] args) {
    String s="daabcbaabcbc";
    String part="abc";

    System.out.println(removeFromString(s,part));
   } 

   public static String removeFromString(String s,String part){
    if(part.length()==0 || part.length()>s.length()){
        return s;
    }
    int occIndex=s.indexOf(part);
    while(occIndex!=-1){
        s=s.substring(0, occIndex).concat(s.substring(occIndex+part.length()));
        occIndex=s.indexOf(part);
    }
    return s;
   }
}
