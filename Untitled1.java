
 import java.util.*;
 public static int find(int[] a,int n)  
{       
    if(a[0+2]==a[0]+a[0+1])    
        return a[n-1]+a[n-2];
    if(a[i+1]-a[i]==a[i+2]-a[i+1])
        return a[n-1]+a[i+1]-a[i];
    int x=a[0];
    int y=a[1]-a[0];            
    if((int)Math.pow(y, 2)==a[2])
        return (int)Math.pow(y, n)+x;
    return 0;
}
public static void main(){
    int n = 5;
    int arr[] = {1,2,3,4,5};
    System.out.println(find(arr,n));
}