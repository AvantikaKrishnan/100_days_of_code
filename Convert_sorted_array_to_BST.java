public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums, nums.length-1, 0);
        
    }

    public TreeNode helper(int[] nums, int h ,int l)
    {
        if(l>h)
        return null;

        int mid = (h+l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = helper(nums, mid-1, l);
        root.right = helper(nums, h,mid+1);

        return root;
    }
