import java.util.*;
public class printAnagramsTogether {
    public static List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> ans= new ArrayList<>();
        HashMap <String,List<String>> res= new HashMap<>();
        
        for(int i=0;i<string_list.length;i++)
        {
            String word=string_list[i];
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            word=new String(ch);
            if(res.containsKey(word))
                res.get(word).add(string_list[i]);
            else
            {
                List<String>a=new ArrayList<>();
                a.add(string_list[i]);
                res.put(word,a);
            }
        }
        for(Map.Entry<String,List<String>>e:res.entrySet())
        {
            ans.add(e.getValue());
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String[] str={"act","god","cat","dog","tac"};
        List<List<String>> ans=Anagrams(str);
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.println(ans.get(i).get(j)+" ");
            }
        }
    }
}
