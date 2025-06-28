class Solution {
    public int uniquePathsIII(int[][] grid) {
        int nb=0;
        int si=0;
        int sj=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1) {
                    si=i;
                    sj=j;
                }
                else if(grid[i][j]==0){
                    nb++;
                }
            }
        }
        //mark starting as visited
        grid[si][sj]=-3;

        int left=find(si-1,sj,nb,grid);
        int right=find(si+1,sj,nb,grid);
        int up=find(si,sj-1,nb,grid);
        int down=find(si,sj+1,nb,grid);
        return left+right+up+down;
    }

    int find(int si,int sj,int nb,int[][] grid){
        //out of the boundary
        if(si<0 || sj<0 || si>=grid.length || sj>=grid[0].length){
            return 0;
        }

        //path found
        if(grid[si][sj]==2 && nb==0){
            return 1;
        }
       
        int left=0;
        int right=0;
        int up=0;
        int down=0;
         //reduce the non blocking blocks and for marking visited we did -2
        if(grid[si][sj]==0)
        { grid[si][sj]=-2;
            nb--;
        left=find(si-1,sj,nb,grid);
        right=find(si+1,sj,nb,grid);
        up=find(si,sj-1,nb,grid);
        down=find(si,sj+1,nb,grid);
        }
        else{
            return 0;
        }

        //backtrack
        if(grid[si][sj]==-2){ 
            nb++;
            grid[si][sj]=0;
        }

        return left+right+up+down;
    }
}