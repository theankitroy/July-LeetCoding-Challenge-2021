    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int pr= mat.length, pc= mat[0].length, count= pr*pc;
        if(r*c != count) return mat;
        int[][] ans= new int[r][c];
        for(int k=0; k<count; k++){
            int i= k/c, j= k%c, pi= k/pc, pj= k%pc;
            ans[i][j]= mat[pi][pj];
        }
        return ans;
    }
