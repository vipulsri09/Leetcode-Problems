class Pair<U, V> {
    public U u;
    public V v;

    public Pair(U u, V v) {
        this.u = u;
        this.v = v;
    }

    public U getKey() {
        return u;
    }

    public V getValue() {
        return v;
    }
}

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Pair<String, Double>>> adj = new HashMap<>();

        // Build the graph
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];

            adj.putIfAbsent(u, new ArrayList<>());
            adj.putIfAbsent(v, new ArrayList<>());

            adj.get(u).add(new Pair<>(v, val));
            adj.get(v).add(new Pair<>(u, 1.0 / val));
        }

        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);

            if (!adj.containsKey(start) || !adj.containsKey(end)) {
                result[i] = -1.0;
            } else if (start.equals(end)) {
                result[i] = 1.0;
            } else {
                Set<String> visited = new HashSet<>();
                result[i] = dfs(start, end, 1.0, visited, adj);
            }
        }

        return result;
    }

    
    private double dfs(String current, String target, double product, Set<String> visited,
                       Map<String, List<Pair<String, Double>>> adj) {
        visited.add(current);

        for (Pair<String, Double> neighbor : adj.get(current)) {
            String nextNode = neighbor.getKey();
            double weight = neighbor.getValue();

            if (visited.contains(nextNode)) continue;

            if (nextNode.equals(target)) {
                return product * weight;
            }

            double result = dfs(nextNode, target, product * weight, visited, adj);
            if (result != -1.0) {
                return result;
            }
        }

        return -1.0;
    }
}