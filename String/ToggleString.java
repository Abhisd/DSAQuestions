package String;

 class ToggleString {
   public static void main(String[] args) {
    String a="AZaz";

    toggle(a);
   } 
   public static void toggle(String a){
    int n=a.length();
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<n;i++){
        int ch=a.charAt(i);
        //System.out.println(ch);
        if(ch>=65 && ch<=90){
            ch=ch+32;
           // ans.append((char)ch);
        }
        else if(ch>=97 && ch<=122){
            ch=ch-32;
           // ans.append((char)ch);
        }
         ans.append((char)ch);
    }

    System.out.println(ans);
   }
}
