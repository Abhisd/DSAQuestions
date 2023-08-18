package String;

public class ReplaceSpace {
    /*
     * Given a string s. Replace all whitespace with @40.
     * ex. I am Abhishek
     * ans= I@40am@40Abhishek.
     */
    public static void main(String[] args) {
        String str="I am Abhishek";
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(String s){
       // int n=s.length();
        s=s.trim();
        s=s.replaceAll("\\s", "@40");
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
        //     if(ch==' '){
        //         s=s.replace(ch, '@');
        //         s=s.replace(ch, '4');
        //         s=s.replace(ch, '0');
        //         s=s.replace(ch, "@40");
        //     }
        // }
        return s;
    }
}
