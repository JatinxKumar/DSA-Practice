class Solution {
    public int subarraySum(int[] nums, int k) {
        int curr_sum=0;
        int count=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            if(hs.containsKey(curr_sum-k)){
                count+=hs.get(curr_sum-k);
            }
            hs.put(curr_sum,hs.getOrDefault(curr_sum,0)+1);
        }
        return count;
    }
}