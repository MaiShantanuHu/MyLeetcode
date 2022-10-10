class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > max) {
                secmax = max;
                max = num;
            }else if (num > secmax) {
                secmax = num;
            }
        }
        return (max-1)*(secmax-1);
    }
}