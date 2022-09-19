public class longPrefixSuffix {
    static int findPrefixSuffix(String str)
    {
        int arr[]=new int[str.length()];
        int j=0,i=1;
        while(i<str.length())
        {
            if(str.charAt(i)==str.charAt(j))
            {
                arr[i]=j+1;
                i++;
                j++;
            }else{
                if(j==0)
                {
                    i++;
                }else{
                    j=arr[j-1];
                }
            }
        }
        return arr[str.length()-1];
    }
    public static void main(String[] args)
    {
        String S="aabaacaab";
        System.out.println(findPrefixSuffix(S));
    }
}
