import java.util.*;
public class kthMaxMin {
    static int getMaxMin(int arr[],int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args)
    {
        int arr[]={7,10,4,3,20,15};
        System.out.println(getMaxMin(arr,3));
    }
}
