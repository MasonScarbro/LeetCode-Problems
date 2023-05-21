// PROBLEM 1480: //
 
 // CODE USED: //
 class Solution {
    public int[] runningSum(int[] nums) {

        int[] indecies = new int[nums.length];
        int sum = 0;
        // for loop that iterates of each indecie of the nums array // 
        for (int i = 0; i < nums.length; i++){

            sum += nums[i]; // has "sum" = sum + the current loop iteration indecie //
           
            
           
             indecies[i] = sum;
        }
        return indecies;

    }
}
// RESULT: ACCEPTED //
