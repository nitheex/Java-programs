class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        
        int[] left = new int[n];
        int[] right = new int[n];

        int maxL = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] > maxL) maxL = height[i];
            left[i] = maxL;
        }

        int maxR = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (height[i] > maxR) maxR = height[i];
            right[i] = maxR;
        }

        for (int i = 0; i < n; i++) {
            int minWall = left[i];
            if (right[i] < minWall) minWall = right[i];
            total += minWall - height[i];
        }

        return total;
    }
}
