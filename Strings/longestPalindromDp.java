class longestPalindromDp{
    static String longestPalin(String S){
        boolean dp[][]=new boolean[S.length()][S.length()];
        int start=0,end=0;
        for(int g=0;g<S.length();g++)
        {
            for(int i=0,j=g;j<S.length();i++, j++)
            {
                if(g==0)
                {
                    dp[i][j]=true;
                }else if(g==1)
                {
                    if(S.charAt(i)==S.charAt(j))
                        dp[i][j]=true;
                    else
                        dp[i][j]=false;
                }else{
                    if(S.charAt(i)==S.charAt(j) && dp[i+1][j-1])
                        dp[i][j]=true;
                    else
                        dp[i][j]=false;
                }
                if(dp[i][j])
                {
                    start=i;
                    end=j;
                }
            }           
        }
        return S.substring(start,end+1);        
    }
    public static void main(String[] args)
    {
        String str="aaaaaabbaa";
        System.out.println(longestPalin(str));
    }
}