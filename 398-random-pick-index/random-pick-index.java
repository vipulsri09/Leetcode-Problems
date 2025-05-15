class Solution {
    Map<Integer, List<Integer>> indexMap;
    Random random;

    public Solution(int[] nums) {
        indexMap = new HashMap<>();
        random = new Random();

        for (int i = 0; i < nums.length; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
    }

    public int pick(int target) {
        List<Integer> indices = indexMap.get(target);
        return indices.get(random.nextInt(indices.size()));
    }
}