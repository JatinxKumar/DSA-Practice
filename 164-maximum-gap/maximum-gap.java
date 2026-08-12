class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2)return 0;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            int maxAns = nums[i+1]-nums[i];
            ans=Math.max(maxAns,ans);
        }
        return ans;
    }
}