class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int res = 0;
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum = sum + nums[j];
                
                if (sum == k) {
                    res++;
                }
            }
        }
        return res;
        
    }
}