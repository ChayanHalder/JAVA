public class transformOneStringtoAnother {
    static int minop(String S1,String S2)
    {
        int count=0;
        int i,j;
        i=j=S1.length();
        while(i>=0&&j>=0)
        {
            if(S1.charAt(i)!=S2.charAt(j))
                count++;
            else
                j--;
            i--;
        }
        return count;
    }
    public static void main(String[]args)
    {
        String str="eacbd";
        String str2="eabcd";
        System.out.println(minop(str,str2));
    }
}
