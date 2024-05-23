class Solution {
    int count = 0;
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        backtrack(nums, k, 0, new ArrayList<>());
        return count;
    }

    private void backtrack(int[] nums, int k, int start, List<Integer> current) {
        if (isValid(current, k)) {
            if (!current.isEmpty()) {
                count++;
            }
        }

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            // System.out.println(current);
            backtrack(nums, k, i + 1, current);
            current.remove(current.size() - 1);  
        }
    }

    private boolean isValid(List<Integer> current, int k) {
        Set<Integer> set = new HashSet<>(current);
        for (int num : current) {
            if (set.contains(num - k) || set.contains(num + k)) {
                return false;
            }
        }
        return true;
    }
}