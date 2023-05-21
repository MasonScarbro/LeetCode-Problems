class Solution {
    public int[] twoSum(int[] nums, int target) {
        int prevnum = 0;
        int[] indecies = new int[2];
        for (int i = 0; i < nums.length; i++){ // loops through the initial array
            for (int j = i + 1; j < nums.length; j++){ // loops through the array to search for a second indecie (i + 1 skips the first)
                if (nums[i] + nums[j] == target){ // checks if the arrays indecie numbers sum match the target
                    indecies[0] = i;
                    indecies[1] = j;
                    return indecies;
                }
            }
        }
        return null; // if loop does not return indecie return nothing
        
    }
}
