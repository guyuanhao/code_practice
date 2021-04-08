package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int[] result = new int[m+n];
    	int indexM = 0;
    	int indexN = 0;
    	for (int index=0; index < m+n; index++) {
    		if(indexM < m && indexN < n) {
    			if (nums1[indexM] < nums2[indexN]) {
        			result[index] = nums1[indexM];
        			indexM++;
        		} else {
        			result[index] = nums2[indexN];
        			indexN++;
        		}
    		} else if (indexM < m ) {
    			result[index] = nums1[indexM];
    			indexM++;
    		} else {
    			result[index] = nums2[indexN];
    			indexN++;
    		}
    		
    	}
    	for (int i=0; i<result.length; i++) {
    		nums1[i] = result[i];
    	}
    }
}
