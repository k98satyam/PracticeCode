// https://leetcode.com/problems/merge-sorted-array/

class mergeTwoSortedArray {
    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;
        
        while (m >=0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[k] = nums1[m];
                m--;
                k--;
            } else {
                nums1[k] = nums2[n];
                n--;
                k--;
            }
        }
        
        while (n >= 0) {
            nums1[k] = nums2[n];
            n--;
            k--;
        }
    }
}