package Assignment12;

public class CountCharacter {
    public static void main(String[]args){
      System.out.print(countChar("Gebrecherkos",0));
    }
    public static int countChar(String s, int i)
    {
        if(i==s.length())
            return 0;
        return 1 + countChar( s, i+1 );
    }

}
