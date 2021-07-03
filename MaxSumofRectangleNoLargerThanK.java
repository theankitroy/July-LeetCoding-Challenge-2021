class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<matrix[0].length;i++){
            int[] sum = new int[matrix.length];
            for(int m = i; m<matrix[0].length;m++){
                for(int j = 0; j<matrix.length;j++){
                    sum[j]+=matrix[j][m];
                    if(sum[j]==k)return  k;  
                    if(sum[j]<k)maxSum=Math.max(maxSum,sum[j]);
                }
                for(int j = 0; j<matrix.length;j++){
                    int summe=0;    
                    for(int n = j; n<matrix.length;n++){
                        summe+=sum[n];
                        if(summe==k)return k;
                        if(summe<k)maxSum=Math.max(maxSum,summe);
                    }
                }
            }
        }
        
        return maxSum;
 
    }
}
