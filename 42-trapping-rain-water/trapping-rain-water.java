class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // process left side
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                    System.out.println("leftside"+ leftMax);
                } else {
                    water += leftMax - height[left];
                     System.out.println("leftside"+ water);
                }
                left++;
            } else {
              
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                     System.out.println("Right : "+ rightMax);
                } else {
                    water += rightMax - height[right];
                     System.out.println("Right : "+ water);
                }
                right--;
            }
        }

        return water;
    }
}