//Window Sliding Technique


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_sum = 0;
        for(int i =0;i<k;i++){
            max_sum += nums[i];
        }
        double windows_sum = max_sum;
        for(int i = k; i<nums.length;i++){
            windows_sum += nums[i]-nums[i-k];
            max_sum = Math.max(max_sum,windows_sum);
        }
    return max_sum/k;
    }
}