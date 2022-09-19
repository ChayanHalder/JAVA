import java.util.*;
public class findTheTriplt {
    public static boolean find3Numbers(int A[],int n,int X)
    {
        Arrays.sort(A);
        for(int i=0;i<n;i++)
        {
            int sum=X-A[i];
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(A[j]+A[k]==sum)
                {
                    return true;
                }else if(A[j]+A[k]>sum)
                {
                    k--;
                }else{
                    j++;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={1,4,45,6,10,8};
        System.out.println(find3Numbers(arr, 6, 13));
    }
}
