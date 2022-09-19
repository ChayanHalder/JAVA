import java.util.*;
class returnListWithoutArgument
{
static ArrayList<Integer> findAllIndex(int[] arr,int target,int index)
{
    ArrayList<Integer> list= new ArrayList<>();
    if(index == arr.length)
        return list;

    if(arr[index] == target)
        list.add(index);

    ArrayList<Integer> ansFromBelowCalls=findAllIndex(arr,target,index+1);
    list.addAll(ansFromBelowCalls);
    return list;
}
    public static void main(String[] args)
    {
        int arr[]={1,2,6,4,4,7};
        System.out.println(findAllIndex(arr, 4, 0));
    }
}