class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tringle=new ArrayList<>();
       for (int i=1;i<=numRows;i++){
        ArrayList<Integer> newarr=new ArrayList<>();
            newarr.add(1);
            int num=1;
            for (int j=1;j<i;j++){
                num=num*(i-j)/j;
                newarr.add(num);
            }
            tringle.add(newarr);
       } 
       return tringle;   
    }
}