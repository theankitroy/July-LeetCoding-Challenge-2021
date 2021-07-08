class Solution {
   // Time: O(N * N)
    //Space: O(k)
    public int kthSmallest(int[][] M, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for(int[] R : M){
            for(int a : R){
                heap.add(a);
                if(heap.size() > k)
                    heap.poll();
            }
        }
        return heap.peek();
    }
}
