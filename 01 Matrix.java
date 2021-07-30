class Solution {
public int[][] updateMatrix(int[][] mat) {
 int ans[][]=new int[mat.length][mat[0].length];
    
     
  for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
       if(mat[i][j]==0){
           ans[i][j]=0;
       }else{
           ans[i][j]=Integer.MAX_VALUE-1;
       }
        
        
        }  
    
  }
     for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
                        if(mat[i][j]!=0){
            if(i-1>=0){
                ans[i][j]=Math.min(ans[i][j],ans[i-1][j]+1);
            }
            if(j-1>=0){
                 ans[i][j]=Math.min(ans[i][j],ans[i][j-1]+1);
            }
            if(i+1<mat.length){
                 ans[i][j]=Math.min(ans[i][j],ans[i+1][j]+1);
            }
            if(j+1<mat[0].length){
                 ans[i][j]=Math.min(ans[i][j],ans[i][j+1]+1);
            }
            
        }
    }
    }
    for(int i=mat.length-1;i>=0;i--){
        for(int j=mat[0].length-1;j>=0;j--){
            if(mat[i][j]!=0){
            if(i-1>=0){
                ans[i][j]=Math.min(ans[i][j],ans[i-1][j]+1);
            }
            if(j-1>=0){
                 ans[i][j]=Math.min(ans[i][j],ans[i][j-1]+1);
            }
            if(i+1<mat.length){
                 ans[i][j]=Math.min(ans[i][j],ans[i+1][j]+1);
            }
            if(j+1<mat[0].length){
                 ans[i][j]=Math.min(ans[i][j],ans[i][j+1]+1);
            }
            
        }
    }
    }


    return ans;
	}}
