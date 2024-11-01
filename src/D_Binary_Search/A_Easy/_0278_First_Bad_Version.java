package D_Binary_Search.A_Easy;

public class _0278_First_Bad_Version {

    public int firstBadVersion(int n) {
        int l = 1, r = n;

        while (l <= r) {
            int m = l + (r - l) / 2;
            boolean badVersion = isBadVersion(m);
            if (badVersion)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }
}