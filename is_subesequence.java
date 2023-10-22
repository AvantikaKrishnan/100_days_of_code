class Solution {
    public boolean isSubsequence(String s, String t) {
       int sl = s.length();
       int tl = t.length();

       int p1=0;
       int p2=0;
       int count = 0;

       while(p1<sl && p2 <tl)
       {
           if(s.charAt(p1) == t.charAt(p2))
           {
               p1++;
               p2++;
               count++;
           }
           else
           {
               p2++;
           }

       }
       if(count == sl)
       return true;
       else 
       return false;
    }
}
