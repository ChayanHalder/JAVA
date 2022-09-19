public class stringPalindrom {
    public static boolean findPalindrom(String S)
    {
        int i=0,j=S.length()-1;
        while(i<j)
        {
            if(S.charAt(i++)!=S.charAt(j--))
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str="abba";
        System.out.println(findPalindrom(str));
    }
}
