public class minNoFlips {
    static int minFlips(String S)
    {
        int flip=0;
        for(int i=0;i<S.length();i++)
        {
            if(i%2==0)
            {
                if(S.charAt(i)=='1')
                    flip++;
            }else{
                if(S.charAt(i)=='0')
                    flip++;
            }
        }
        return Math.min(flip,S.length()-flip);
    }
    public static void main(String[] args)
    {
        String str="0001010111";
        System.out.println(minFlips(str));
    }
}
