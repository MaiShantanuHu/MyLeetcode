class Solution {
    public int dominantIndex(int[] nums) {
        int fst = 0;
        int sec = 0, maxIndx = 0;
        for (int i=0; i<nums.length; ++i) {
            if (fst < nums[i]) {
                sec = fst;
                fst = nums[i];
                maxIndx = i;
            } 
            else if (sec < nums[i]) {
                sec = nums[i];
            }
        }
        return fst >= sec*2 ? maxIndx : -1;
    }
}