class Solution {
    public int findContentChildren(final int[] g, final int[] s) {
        int i = g.length - 1, j = s.length - 1, count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(i >= 0 && j >= 0) {
            final int greed = g[i], size = s[j];

            if(size >= greed)
                j--;

            i--;
        }

        return s.length - j - 1;
    }
}