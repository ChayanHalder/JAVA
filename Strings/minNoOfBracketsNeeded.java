import java.util.*;
public class minNoOfBracketsNeeded {
    static int countRev (String s)
    {
        Stack<Character>st=new Stack<>();
        int ans=0;
        if(s.length()%2!=0)
            return -1;
        for(int i=0;i<s.length();i++)
        {
            if(st.empty())
                st.push(s.charAt(i));
            else if(st.peek()=='{'&& s.charAt(i)=='}')
                st.pop();
            else
                st.push(s.charAt(i));
        }
        while(!st.empty())
        {
            char temp1=st.peek();
            st.pop();
            char temp2=st.peek();
            st.pop();
            
            if(temp1==temp2)
                ans++;
            else
                ans+=2;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        String s="}{{{}}}}}{";
        System.out.println(countRev(s));
    }
}
