class Solution {
    public int removeDuplicates(int[] nums) {
        int insertPos = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        return insertPos;
    }
}