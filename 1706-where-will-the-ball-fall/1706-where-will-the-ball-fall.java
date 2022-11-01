class Solution {
    
    Integer memo[][],m,n;
    
    public int[] findBall(int[][] grid) {
        m=grid.length; n=grid[0].length; memo = new Integer[m][n];
        int i,ar[]=new int[n];
        for(i=0;i<n;i++) ar[i]=go(grid,i,0);
        return ar;
    }
    
    int go(int[][] grid, int i, int j){
        if(j==m) return i;
        if(memo[j][i]!=null) 
            return memo[j][i];
        if(grid[j][i]==1){
            if((i+1)==n || grid[j][i+1]==-1) 
                return -1;
            else 
                return memo[j][i]=go(grid,i+1,j+1);
        }
        else{
            if((i-1)==-1 || grid[j][i-1]==1) 
                return -1;
            else
                return memo[j][i]=go(grid,i-1,j+1);
        }
    }
}