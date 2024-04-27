class Solution {
    public int findRotateSteps(String ring, String key) {
        int ptr = 0, index = 0;
        int n = ring.length();
        int m = key.length();
        Map<String, Integer> memo = new HashMap<>();
        return solve(ring, key, ptr, index, memo);
    }

    public int solve(String ring, String key, int ptr, int index, Map<String, Integer> memo) {
        int n = ring.length();
        int m = key.length();

        if (index >= m) return 0;

        String memoKey = ptr + "|" + index;
        if (memo.containsKey(memoKey)) return memo.get(memoKey);

        int step = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (ring.charAt(i) == key.charAt(index)) {
                int dist = Math.min(Math.abs(i - ptr), n - Math.abs(i - ptr)) + 1;
                step = Math.min(step, dist + solve(ring, key, i, index + 1, memo));
            }
        }

        memo.put(memoKey, step);
        return step;
    }
}