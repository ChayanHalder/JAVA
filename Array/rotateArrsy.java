public class rotateArrsy {
    static void getRotate(int arr[],int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    static void display(int arr[],int n){
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int A[]={1,2,3,4,5};
        int N=5;
        getRotate(A,N);
        display(A,N);
    }
}
