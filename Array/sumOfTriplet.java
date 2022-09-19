public class sumOfTriplet {
    public static int findTriplet(int arr[],int n,int x)
    {
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            int sum = x-arr[i];
            while(j<k)
            {
                if(arr[j]+arr[k]==sum)
                {
                    return  1;
                }else if(arr[j]+arr[k]<sum)
                    j++;
                else
                    k++;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int arr[]={1,4,45,6,10,8};
        System.out.println(findTriplet(arr,6,13));
    }
}
