class Solution {
    public String removeStars(String s) {

        return helper(s, 0);
        
    }
    public String helper(String s, int p)
    {
        Stack<Character> stack = new Stack<>();

        while(p!= s.length())
        {
            char c = s.charAt(p);
            if(c == '*')
            {
            stack.pop();
            p++;
            }
            else
            {
                stack.push(c);
                p++;
            }
        } 

        String ans = "";

        while(!stack.isEmpty())
        {
            ans = stack.pop() + ans;
        }

        return ans;

    }
}
