class Solution {
    public int minimumOperations(int[][] nums) {
        int count=0;
        for(int i=0;i<nums[0].length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[j][i]<=nums[j-1][i]){
                    int req=(nums[j-1][i]+1);
                    count+=(req-nums[j][i]);
                    nums[j][i]=req;
                }
            }
        }
        return count;
    }
}