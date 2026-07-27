// class Solution {
//     public int largestPerimeter(int[] nums) {
//         int max = 0;
//         for (int i = 0; i < nums.length-2; i++) {
//             for (int j = i + 1; j < nums.length-1; j++) {
//                 for (int k = j + 1; k < nums.length; k++) {
//                     if (nums[i] + nums[j] > nums[k] &&
//                             nums[i] + nums[k] > nums[j] &&
//                             nums[j] + nums[k] > nums[i]) {
//                         max = Math.max(max, perimiter(nums[i], nums[j], nums[k]));
//                     }
//                 }
//             }
//         }
//         return max;
//     }

//     public int perimiter(int a, int b, int c) {
//         return a + b + c;
//     }
// }

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
       
          for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        
        return 0;
    }
}