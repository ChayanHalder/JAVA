public class minswapBracketBalance {
    static int minNoSwap(String S)
    {
        int open=0,close=0,fault=0,swap=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==']')
            {
                close++;
                fault=close-open;
            }else{
                open++;
                if(fault>0)
                {
                    swap+=fault;
                    fault--;
                }
            }
        }
        return swap;
    }
    public static void main(String[] args)
    {
        String str="[]][][";
        System.out.println(minNoSwap(str));
    }
}
