public class sorting012 {
    static void sort(int arr[], int n)
    {
        int start=0,i=0,end=n-1;
        while(i<end){
            int temp;
            if(arr[i]==0)
            {
                temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
                i++;
            }else if(arr[i]==2)
            {
                temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
                end--;
                i++;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={0,2,1,2,0};
        int n=5;
        sort(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
