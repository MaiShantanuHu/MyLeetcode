/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n<=0 || !isBadVersion(n)) {
            return -1;
        }
        
        if (isBadVersion(1)) {
            return 1;
        }
        
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}