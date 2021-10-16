package Assignment12;

public class ReverseString {
  public static void main(String[]args){
      String str="gebrecherkos";
      reverse(str,0);
  }


    public static void reverse(String str,int n){
        if(n==str.length())
            return;
        reverse(str,n+1);
        System.out.print(str.charAt(n));
    }

}
