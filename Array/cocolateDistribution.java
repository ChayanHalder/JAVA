import java.util.*;
public class cocolateDistribution {
    public static int differenceBetween(int A[],int N,int M)
    {
        Arrays.sort(A);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=N-M;i++)
        {
            if((A[i+M-1]-A[i])<min)
                min=A[i+M-1]-A[i];
        }
        return min;
    }
    public static void main(String[] args)
    {
        int A[]={7,3,2,4,9,12,56};
        System.out.println(differenceBetween(A,7,3));
    }
}
