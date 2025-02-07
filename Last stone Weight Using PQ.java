class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>( (a,b) -> b-a );
        // max-heap
        int n=stones.length;
        for(int k:stones){
            pq.offer(k);
        }
        while(pq.size() > 1){
             int m1=pq.poll();
             int m2=pq.poll();
             if(m1-m2 !=0 ){
                pq.offer( m1-m2);
             }
        }
        if(pq.size()>0){
            return pq.poll();
        }
        return 0;

    }
}
