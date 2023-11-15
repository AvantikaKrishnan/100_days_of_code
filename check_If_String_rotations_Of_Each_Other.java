class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        int n = s1.length();
        int m  = s2.length();
        
        if(m!= n)
        return false;
        
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        
        for(int i =0;i<n;i++)
        q1.add(s1.charAt(i));
        
        for(int i = 0;i<m;i++)
        q2.add(s2.charAt(i));
        
        while(m>0)
        {
            m--;
             char ch = q2.peek();
             q2.remove();
             q2.add(ch);
             
             if(q1.equals(q2))
             return true;
        }
        
        return false;
    }
    
}
