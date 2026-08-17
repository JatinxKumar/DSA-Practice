class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }

        int maxCount=0;
        for (int num : hs) {
            if(!hs.contains(num-1)){
                int count=1;
                int currNum = num;
                while(hs.contains(currNum+1)){
                    currNum++;
                    count++;
                }
                maxCount= Math.max(count,maxCount);
            }
        }

        return maxCount;
    }
}