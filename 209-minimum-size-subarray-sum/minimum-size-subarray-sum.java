class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            while (sum >= target){
                int currLength = right - left + 1;
                if (currLength < length){
                    length = currLength;
                }
                sum -= nums[left];
                left++;
            }
        }

        if (length != Integer.MAX_VALUE){
            return length;
        } else {
            return 0;
        }
    }
}