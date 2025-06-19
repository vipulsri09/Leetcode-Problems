class Solution {
    public long numberOfWays(String s) {
        long count0 = 0, count1 = 0;
        long count01 = 0, count10 = 0;
        long count010 = 0, count101 = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                count0++;
                count10 += count1;
                count010 += count01;
            } else {
                count1++;
                count01 += count0;
                count101 += count10;
            }
        }
        return count010 + count101;
    }
}
