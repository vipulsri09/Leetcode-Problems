class Solution {
    public long numberOfWays(String s) {
        long zeroes=0;
        long ones=0;
        long zeroOne=0;
        long oneZero=0;
        char[] arr=s.toCharArray();
        long ans=0;
        for(char c:arr){
            if(c=='0'){
                ans=ans+zeroOne;
                oneZero=oneZero+ones;
                zeroes++;

            }
            else{
                ans=ans+oneZero;
                zeroOne=zeroOne+zeroes;
                ones++;
            }
        }
        return ans;
    }
}