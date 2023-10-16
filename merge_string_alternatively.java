class Solution {
    public String mergeAlternately(String word1, String word2) {

        int l = word1.length() + word2.length();
        String ans = "";
        int p1 =0;
        int p2 =0;


        for(int i =0; i< l ;i++)
        {
            if(i%2 == 0 && p1< word1.length())
            {
                 ans += word1.charAt(p1++);
            }
            else if(i%2 != 0 && p2< word2.length())
            {
                ans += word2.charAt(p2++);
            }
        
        }

        while(p1 < word1.length())
        ans += word1.charAt(p1++);

        while(p2 < word2.length())
        ans += word2.charAt(p2++);

        return ans;
        
    }
}
