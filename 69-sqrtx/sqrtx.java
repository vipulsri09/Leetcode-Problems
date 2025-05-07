class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
            int start=1, end=x/2, result=0;
            while(start<=end){
                int mid = (start+end)/2;
                if((long) mid *mid <= x){
                    result=mid;
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return result;
        }
}
        