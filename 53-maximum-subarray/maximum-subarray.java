class Solution {
    public int maxSubArray(int[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }

    private int divideAndConquer(int[] nums, int left, int right) {
        // 1. if nums length = 1, return the number
        if (left == right) {
            return nums[left];
        }

        // 2. find the middle
        int mid = left + (right - left) / 2;

        // 3. recurse for finding the left and the right side
        int leftMax = divideAndConquer(nums, left, mid);
        int rightMax = divideAndConquer(nums, mid + 1, right);

        // 4. if the max sum cross the middle line
        int crossMax = getCrossMax(nums, left, mid, right);

        // 5. find the largest sum
        return Math.max(leftMax, Math.max(rightMax, crossMax));
    }

    private int getCrossMax(int[] nums, int left, int mid, int right) {
        // 1. start adding from the middle for the left side
        int leftMaxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = mid; i >= left; i--) {
            currentSum += nums[i];
            leftMaxSum = Math.max(currentSum, leftMaxSum);
        }

        // 2. start adding from the middle for the right side
        int rightMaxSum = Integer.MIN_VALUE;
        currentSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            currentSum += nums[i];
            rightMaxSum = Math.max(currentSum, rightMaxSum);
        }

        // return the sum of both side
        return leftMaxSum + rightMaxSum;
    }
}