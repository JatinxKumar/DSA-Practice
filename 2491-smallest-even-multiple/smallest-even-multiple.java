class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=0;i<n;i++){
            if(n%2==0){
                return n;
            }
            else if(n%2!=0){
                return n*2;
            }
        }
        return -1;
    }
}