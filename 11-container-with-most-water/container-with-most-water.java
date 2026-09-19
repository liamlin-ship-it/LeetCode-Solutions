class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int maxVol = 0;

        while (left < right){
            int currVol = (right - left) * Math.min(height[left], height[right]);
            if (currVol > maxVol){
                maxVol = currVol;
            }

            if (height[left] > height[right]){
                right--;
            } else {
                left++;
            }
        }

        return maxVol;
    }
}