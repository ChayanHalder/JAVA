import java.util.*;
public class unionTwoArr {
    public static int doUnion(int a[],int n,int b[], int m)
    {
        HashSet<Integer> h = new HashSet<>();
        for(int temp:a)
            h.add(temp);

        for(int temp:b)
            h.add(temp);

        return h.size();
    }
    public static void main(String[] args)
    {
        int A[]={1,2,3,4,5};
        int B[]={1,2,3};
        System.out.println(doUnion(A,5,B,3));
    }
}
