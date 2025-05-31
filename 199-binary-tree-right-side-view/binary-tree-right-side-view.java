class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Map<Integer, Integer> levelMap = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> p = q.poll();
            TreeNode node = p.getKey();
            int level = p.getValue();

            levelMap.put(level, node.val);  

            if (node.left != null)
                q.offer(new Pair<>(node.left, level + 1));
            if (node.right != null)
                q.offer(new Pair<>(node.right, level + 1));
        }

        for (int i = 0; i < levelMap.size(); i++) {
            res.add(levelMap.get(i));
        }

        return res;
    }
}