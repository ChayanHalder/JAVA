public class permutationOfString {
    static void permutation(String str,int l,int n)
    {
        if(l==n)
        {
            System.out.println(str);
            return;
        }
        for(int i=l;i<n;i++)
        {
            str=swap(str,l,i);
            permutation(str,l+1,n);
            str=swap(str,l,i);
        }
    }    
    static String swap(String S,int p1,int p2)
    {
        char ch[]=S.toCharArray();
        char temp=ch[p1];
        ch[p1]=ch[p2];
        ch[p2]=temp;
        return S=String.valueOf(ch);
    }
    public static void main(String[] args)
    {
        String S="abc";
        permutation(S,0,S.length());
    }
}
