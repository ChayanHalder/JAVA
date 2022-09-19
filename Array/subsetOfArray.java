import java.util.*;
public class subsetOfArray {
    public static String subSet(int a1[],int a2[],int n, int m)
    {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i,j,count;
        i=j=count=0;
        while(i<n&&j<m)
        {
            if(a1[i]==a2[j])
            {
                count++;
                i++;
                j++;
            }else if(a1[i]<a2[j])
            {
                i++;
            }else{
                return "No";
            }
        }
        if(count==m)
        {
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args)
    {
        int A1[]={11,1,13,21,3,7};
        int A2[]={11,3,7,1};
        System.out.println(subSet(A1,A2,6,4));
    }
}
