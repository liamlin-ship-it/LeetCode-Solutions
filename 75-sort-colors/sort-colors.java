class Solution {
        public void sortColors(int[] nums) {
            // the index that next 0 should be placed
            int low = 0;
            // the current index you're checking
            int mid = 0;
            // the index that next 2 should be placed
            int high = nums.length - 1;

            while (mid <= high){
                if (nums[mid] == 0){
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                } else if (nums[mid] == 1){
                    mid++;
                } else {
                    int temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                }
            }
        }
    }