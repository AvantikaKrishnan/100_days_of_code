class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        helper(nums,0);
        return ans;
        
    }
    public void helper(int arr[], int begin)

    {
        if(begin == arr.length)
        {
             List<Integer> temp = new ArrayList<Integer>();
            for (int num : arr) temp.add(num);
            ans.add(temp);
            return;
        }

        for(int i = begin ; i<arr.length;i++)
        {
            int temp = arr[begin];
            arr[begin] = arr[i];
            arr[i] = temp;

            helper(arr,begin+1);

             int temp1 = arr[begin];
            arr[begin] = arr[i];
            arr[i] = temp1;
        }
       

    }
}
