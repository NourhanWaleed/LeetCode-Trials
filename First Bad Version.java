/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r=n;
        while(l<=r){
            int mid=r-((r-l)/2);
            boolean res = isBadVersion(mid);
            if(res && !isBadVersion(mid-1)) {
                return mid;
            }
            if(res) {
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return -1;
    }
}