class Solution {
    public int lastStoneWeight(int[] stones) {
        int l=stones.length;
        if(l==1){
            return stones[0];
        }
        Arrays.sort(stones);
        while( stones[l-2] > 0){
            stones[l-1]= stones[l-1] - stones[l-2];
            stones[l-2]=0;
            Arrays.sort(stones);
            for(int i=0;i<l;i++){
                System.out.print(stones[i] + " ");
            }
        }
        return stones[l-1];
    }
}
// Arrays.sort, should be given after only.
// EX : 3 7 2 check for this if u write sort at first.
