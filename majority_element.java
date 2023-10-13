class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int count = 0;
        int e =0;
        for(int i = 0 ;i<l;i++)
        {
            if(count == 0)
            {
                e = nums[i];
            }
            if(nums[i] == e)
            count++;
            else
            count--;
        }
        return e;
    }
}
