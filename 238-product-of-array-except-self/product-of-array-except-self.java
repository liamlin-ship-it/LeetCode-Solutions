class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // calculate left side
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            // update the answer after multiplied
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // calculate right side
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // multiple with left side
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}