import java.util.*;

class Solution {
    private final Map<Integer, int[]> map = new HashMap<>();
    private final Random random = new Random();

    public Solution(int[] nums) {
        Map<Integer, List<Integer>> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            List<Integer> list = tempMap.get(val);
            if (list == null) {
                list = new ArrayList<>();
                tempMap.put(val, list);
            }
            list.add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : tempMap.entrySet()) {
            List<Integer> list = entry.getValue();
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            map.put(entry.getKey(), arr);
        }
    }

    public int pick(int target) {
        int[] indices = map.get(target);
        return indices[random.nextInt(indices.length)];
    }
}
