class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]){
                    result[i]++;
                } else if (nums[i] < nums[j]) {
                    result[j]++;
                }
            }
        }

        return result;
    }
}