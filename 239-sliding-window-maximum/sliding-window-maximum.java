class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int idx = 0; idx < nums.length; idx++) {
            if (!deque.isEmpty() && deque.getFirst() <= idx - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.getLast()] < nums[idx]) {
                deque.pollLast();
            }

            deque.addLast(idx);

            if (idx >= k - 1) {
                res.add(nums[deque.getFirst()]);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
