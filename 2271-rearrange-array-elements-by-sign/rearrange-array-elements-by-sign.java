class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] a = new int[n / 2];
        int[] b = new int[n / 2];

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0){
                a[countA] = nums[i];
                countA++;
            } else if (nums[i] < 0) {
                b[countB] = nums[i];
                countB++;
            }
        }

        int[] newArr = new int[n];
        for (int i = 0; i < n / 2; i++) {
            newArr[i * 2] = a[i];
            newArr[i * 2 + 1] = b[i];
        }

        return newArr;
    }
}