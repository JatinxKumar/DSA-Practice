class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int currSum=0;
        int maxLen=0;
        hs.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)currSum+=1;
            if(nums[i]==0)currSum-=1;

            if(hs.containsKey(currSum)){
                maxLen= Math.max(maxLen,i-hs.get(currSum));
            }else{
                hs.put(currSum,i);
            }
        }
        return maxLen;
    }
}