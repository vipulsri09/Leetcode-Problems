class Solution {
    int[] nums;

    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int pick(int target) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                l.add(i);
            }
        }
        return l.get((int)(Math.random()*(l.size())));
    }
}