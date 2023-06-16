/* Okay This one took some thought and a whole lot of looking up, I would be lying If I said I didnt watch a tutorial on mergesort, I havent taken data structs and algs but
I wanted to see all the hubub, all the rave, all the chatter, the meat, the deats, the hooplah, anyway essentially in the sortArray function is the divide and conquer so to speak as the algo goes
you split the array and you need it to be a int because JS be like htat so floor it and then you split the array left and right side, after you want to call the funciton recursivley (ignore the merge function for now)
kind of hard to ignorre but the merge function is what is really performing the actual sorting so first you define an array which is gonna be the final array that you will return after that you preform a loop to go through each array left or right and check there elements
at the beginning and if left lesser store first and vice versa. Heres where things get a little tricky the shift function is removing the element from the array but remember its recursive thats what was important aboput the sort array so its going to start at the bottom so
to speak and work with the ''most split'' arrays (thats a bad explanation) but essentially it removes and adds it to the array and if any elements are left over it concatnates it accordingly to the array so it sorts then puts that array into its repective array and then preforms
the sort array on that array and repeats that until left and right are sorted (not the original left and right since they will be empty by now) then it grabs those two and preforms the sort on each and then concats them together */ 
// BETTER COMMENTS NEED TO BE MADE ^^^

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    if (nums.length < 2){
        return nums;
    }
    const midArray = Math.floor(nums.length / 2);
    const leftArray = nums.slice(0, midArray);
    const rightArray = nums.slice(midArray);
    return merge(sortArray(leftArray), sortArray(rightArray));
};
function merge(leftArray, rightArray) {
    const array = [];
    while (leftArray.length > 0 && rightArray.length > 0){
        if (leftArray[0] < rightArray[0]){
            array.push(leftArray.shift());
        } else {
             array.push(rightArray.shift());
        }
    }
    // console.log(array.concat(leftArray, rightArray)); //TESTING -- Easy to see the process (put into leetcode for testcases) by printing you can see the two seperate arrays before they merge and then print array and it comes together
    return array.concat(leftArray, rightArray);
}
