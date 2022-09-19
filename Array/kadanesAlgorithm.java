public class kadanesAlgorithm {
    static int sum(int arr[],int n)
    {
        int sum = arr[0],tempsum = arr[0];
        for(int i=1;i<n;i++)
        {
            if(tempsum>=0)
            {
                tempsum+=arr[i];
            }
            if(tempsum<0)
            {
                tempsum=arr[i];
            }
            if(tempsum>sum)
            {
                sum=tempsum;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,-2,5};
        int n=5;
        System.out.println(sum(arr,n));
    }
}
