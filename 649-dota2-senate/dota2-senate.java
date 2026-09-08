class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        for(int i=0;i<n;i++){
            char ch=senate.charAt(i);
            if(ch=='R'){
                r.add(i);
            }
            else if(ch=='D'){
                d.add(i);
            }
        }

        while(!r.isEmpty() && !d.isEmpty()){
            int ridx = r.poll();
            int didx = d.poll();
            if(ridx < didx){
                r.add(ridx+n);
            }
            else{
                d.add(didx+n);
            }
        }
        if(r.isEmpty()){
            return "Dire";
        }
        else return "Radiant";
    }
}