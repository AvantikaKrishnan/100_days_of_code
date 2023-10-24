class Solution {
     
    public List<List<String>> partition(String s) {
       List<List<String>> list = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        helper(s,ll,list);
        return list;
        

        
    }
    public static void helper(String s , List<String> ll, List<List<String>> list)
    {

        if(s.isEmpty())
        {
            ArrayList<String> copy = new ArrayList<>(ll);
            list.add(copy);

           // ll.clear();
            return ;
        }

        for(int j =0;j<s.length();j++) {
            String s1 = s.substring(0, j+1);
            //s2 = s.substring(j+1);

            if (isPalindrome(s1)) {

                ll.add(s1);
                helper(s.substring(j+1), ll,list);
                ll.remove(ll.size()-1);

            }
        }
        return ;
    }

    public static boolean isPalindrome(String s)
    {
        int start =0;
        int end = s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
           start ++;
            end--;
        }
        return true;
    }
}
