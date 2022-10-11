class Solution {
    public boolean isPowerOfThree(int n) {
        if (powThree(n)) {
            return true;
        }
        return false;
    }
    
    public boolean powThree(int n) {
        if ((Math.log10(n)/Math.log10(3))%1 == 0) {
            return true;
        }
        return false;
    }
}