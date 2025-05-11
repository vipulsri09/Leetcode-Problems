class Solution {
    public void gameOfLife(int[][] board) {
        int[][] temp=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                temp[i][j]=board[i][j];
            }
        }
        int m=temp.length;
        int n=temp[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            int cnt0=0;
             int cnt1=0;
             int hr1=-1,hr2=-1,hr3=-1,hr4=-1,hr5=-1,hr6=-1,hr7=-1,hr8=-1,hr9=-1;
             if(i-1>=0&&j-1>=0) hr1=temp[i-1][j-1];
             if(hr1==0) cnt0++;
             else if(hr1==1) cnt1++;

             if(i-1>=0)  hr2=temp[i-1][j];
             if(hr2==0) cnt0++;
             else if(hr2==1)cnt1++;

             if(i-1>=0&&j+1<n) hr3=temp[i-1][j+1];
             if(hr3==0) cnt0++;
             else if(hr3==1)cnt1++;

             if(j-1>=0) hr4=temp[i][j-1];
             if(hr4==0) cnt0++;
             else if(hr4==1)cnt1++;

             if(j+1<n)  hr6=temp[i][j+1];
             if(hr6==0) cnt0++;
             else if(hr6==1)cnt1++;

             if(i+1<m&&j-1>=0)  hr7=temp[i+1][j-1];
             if(hr7==0) cnt0++;
             else if(hr7==1)cnt1++;

             if(i+1<m)  hr8=temp[i+1][j];
             if(hr8==0) cnt0++;
             else if(hr8==1)cnt1++;

             if(i+1<m&&j+1<n)  hr9=temp[i+1][j+1];
             if(hr9==0) cnt0++;
             else if(hr9==1)cnt1++;

         if(temp[i][j]==0){ if (cnt1==3) board[i][j]=1;}
         else if(temp[i][j]==1){

        if(cnt1<2||cnt1>3){
            board[i][j]=0;
        }}
             
              
            }
        }
    }
}