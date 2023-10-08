import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < m; i++){
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++){
            list.add(nums2[i]);  
        }
        Collections.sort(list);
        for (int k = 0; k < list.size(); k++){
            nums1[k] = list.get(k);
        }
    }
}
