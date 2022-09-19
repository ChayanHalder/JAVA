public class rotation {
    public static boolean findRotation(String S1,String S2)
    {
        return (S1.length()==S2.length() && (S1+S1).contains(S2));
    }
    public static void main(String[] args)
    {
        String s1="ball";
        String s2="llba";
        System.out.println(findRotation(s1,s2));
    }
}
