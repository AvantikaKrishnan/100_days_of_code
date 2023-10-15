class Solution {
    public boolean isPalindrome(int x)
     {
         String s=String.valueOf(x);
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        String s1 = input1.toString();
        if(s.equals(s1))
            return true;
        else
            return false;
  
        
    }
}
