public class minSwapRequired {
    public static int minswap(int arr[],int n, int k)
    {
        int good=0,bad=0; 

        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
                good++;
            else
                bad++;
        }
        int i=0,j=good,ans=bad;
        while(j<n)
        {
            if(arr[i]>k)
                bad--;

            if(arr[j]>k)
                bad++;

            ans= Math.min(ans,bad);
            i++;j++;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={2,7,9,5,8,7,4};
        System.out.println(minswap(arr,7,6));    
    }
}
