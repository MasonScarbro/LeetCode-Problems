import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums){
            list.add(num);
        }
        for (int i = list.size() - 1; i >= 0 ; i--){
            if (list.get(i) == 0){
                list.add(list.get(i));
                list.remove(i);

            }
        }
        for (int k = 0; k < nums.length; k++){
            nums[k] = list.get(k);
        }
        System.out.println(nums);
    }
}
