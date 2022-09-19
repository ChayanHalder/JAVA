public class minCharToMkPalindrom {
    static boolean isPalinrom(String S)
    {
        int n=S.length();
        for(int i=0,j=n-1;i<=j;i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="bababaa";
        int cnt=0;
        int flag=0;
        while(s.length()>0)
        {
            if(isPalinrom(s))
            {
                flag=1;
                break;
            }else{
                cnt++;
                s=s.substring(0,s.length()-1);
            }
        }
        if(flag==1)
           System.out.println(cnt);
    }
}
