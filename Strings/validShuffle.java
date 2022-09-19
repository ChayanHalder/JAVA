import java.util.*;
public class validShuffle {
    static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);
        return str;
      }
    static boolean findShuffle(String S1,String S2,String S3)
    {
        S1=sortString(S1);
        S2=sortString(S2);
        S3=sortString(S3);

        if(S1.length()+S2.length()!=S3.length())
        {
            return false;
        }
        int i=0,j=0,k=0;
        while(k<S3.length())
        {
            if(i<S1.length() && S1.charAt(i)==S3.charAt(k))
            {
                i++;
            }else if(j<S2.length() && S2.charAt(j)==S3.charAt(k))
            {
                j++;
            }else{
                return false;
            }
            k++;
        }
        return true;
    }


    public static void main(String[] args) {

        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};
        for(String result: results)
        {
            System.out.println(first+" "+second+" "+result+" "+findShuffle(first,second,result));
        }
    }
}
