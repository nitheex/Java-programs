class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            
            int h = height[left];
            if (height[right] < h) {
                h = height[right];
            }
            
            int currentWater = width * h;
            if (currentWater > maxWater) {
                maxWater = currentWater;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
