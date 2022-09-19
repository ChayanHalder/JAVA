public class allNegativeOneSide {
    static void setNegative(int arr[],int n)
    {
        int end=n-1,i=0;
        while(i<end)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
                end--;
            }else{
                i++;
            }
        }
    }
    static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,-3,-4,6,3,-9,4};
        int n=7;
        setNegative(arr, n);
        display(arr, n);
    }
}
