public class smallestSubarray {
    public static long sb(long a[],long n,long x)
    {
        long start=0,end=0;
        long ans=n+1;
        long sum =0;
        while(end<n){
            while(sum<=x && end<n){
                sum+=a[(int)end];
                end++;
            }
            while(sum>x && start<n){
                ans=Math.min(ans,end-start);
                sum-=a[(int)start];
                start++;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        long a[]={2,3,5,1,6,7};
        System.out.println(sb(a,6,6));
    }
}
