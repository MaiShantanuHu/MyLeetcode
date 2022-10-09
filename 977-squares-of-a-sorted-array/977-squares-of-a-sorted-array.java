class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int start = 0;
        int end = n-1;
        
        for (int i=n-1; i>=0; --i) {
            int fst = nums[start]*nums[start];
            int snd = nums[end]*nums[end];
            
            if (fst > snd) {
                res[i] = fst;
                start++;
            }else{
                res[i] = snd;
                end--;
            }
        }
        return res;
    }
}


        