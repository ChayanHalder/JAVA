public class subsequenceOfString {
    static void findSubsequence(String ans,int i,int n,String str)
    {
        if(i==n){
            System.out.println(ans);
        }else{
            findSubsequence(ans,i+1,n,str);
            
            findSubsequence(ans+str.charAt(i),i+1,n,str);
        }
    }    
    public static void main(String[] args)
    {
        String S="abc";
        findSubsequence("",0,S.length(),S);
    }
}
