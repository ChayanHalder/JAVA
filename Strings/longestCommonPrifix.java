public class longestCommonPrifix {
    static int minLength(String arr[],int n)
    {
        int min=arr[0].length();
        for(int i=0;i<n;i++)
        {
            if(arr[i].length()<min)
                min=arr[i].length();
        }
        return min;
    }
    static String commonPrefix(String[] arr,int n)
    {
        int minlen=minLength(arr, n);
        String result="";
        char cur;

        for(int i=0;i<minlen;i++)
        {
            cur=arr[0].charAt(i);
            for(int j=1;j<n;j++)
            {    if(arr[j].charAt(i)!=cur)
                    return result;
            }
            result+= cur;
        }
        return result;
    }
    public static void main(String[] args)
    {
        String arr[]={"flower","flow","flight"};
        String str=commonPrefix(arr, arr.length);
        if(str.length()>0)
            System.out.println(str);
        else
            System.out.println("There is no common prefix");
    }
}
