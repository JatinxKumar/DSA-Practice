class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i:map.keySet()){
            if(map.get(i)>n/3){
                ans.add(i);
            }
        }
        return ans;
    }
}