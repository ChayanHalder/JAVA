import java.util.*;
public class findSecondRepeatedWord {
    static String secFrequent(String arr[], int N)
    {
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int pos=0,count=1;
        for(int i=0;i+1<arr.length;i++)
        {
            if(arr[i]==arr[i+1])
                count++;
            else 
                count=1;
            if(count>max)
                max=count;
        }
        count=1;
        for(int i=0;i+1<arr.length;i++)
        {
            if(arr[i]==arr[i+1])
                count++;
            else 
                count=1;
            if(count<max && count>secmax)
                pos=i;
        }
        return arr[pos];
    }
    //  static String secFrequent(String arr[], int N)
    //  {
    //      HashMap<String,Integer> map=new HashMap<>();
    //      for(int i=0;i<N;i++)
    //      {
    //          if(map.containsKey(arr[i])==true)
    //          {
    //              int x=map.get(arr[i]);
    //              map.put(arr[i],x+1);
    //          }else{
    //              map.put(arr[i],1);
    //          }
    //      }
    //      int max=0;
    //      for(String S: map.keySet())
    //      {
    //          if(map.get(S)>max)
    //              max=map.get(S);
    //      }
    //      int sec=0;
    //      String str="";
    //      for(String S: map.keySet())
    //      {
    //          if(max>map.get(S)&&map.get(S)>sec){
    //              sec=map.get(S);
    //              str=S;
    //          }
    //      }
    //      return str;
    //  }
    public static void main(String[] args)
    {
        String[] S={"aaa","aaa","ccc","bbb","aaa","bbb"};
        System.out.println(secFrequent(S,S.length));
    }
}
