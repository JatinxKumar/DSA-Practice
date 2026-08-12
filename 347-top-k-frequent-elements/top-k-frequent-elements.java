class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> ls = new ArrayList<>(map.keySet());
        Collections.sort(ls,(a,b)-> map.get(b)-map.get(a));
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = ls.get(i);
        }
        return ans;
    }
}