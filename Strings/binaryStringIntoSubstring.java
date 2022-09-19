public class binaryStringIntoSubstring {
    static int countBinary(String str,int n)
    {
        int cnt0=0,cnt1=0,ans=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='0')
                cnt0++;
            else
                cnt1++;
            if(cnt0==cnt1)
                ans++;
        }
        if(cnt0!=cnt1)
            return -1;

        return ans;
    }    
    public static void main(String[] args)
    {
        String S="0101001101";
        System.out.println(countBinary(S,S.length()));
    }
}
