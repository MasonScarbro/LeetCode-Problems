public class Solution {
    public int Fib(int n) {
        if (n <2){
            return n;
        } else {
            return Fib(n-1) + Fib(n-2);
        }
    }
}
/* Once You understand how the fibonacci sequence works you can figure this out by treating n not as a number but rather the place in the fibonacci sequence so F(4) is or should be 3 which means the previous two have to be or add to 3 so 1 and 2.
 With this being said the previous places F(3) and F(2) must be 1 and 2 but heres why the recursive method will work for any number: F(3) + F(2) would have to equal 2 + 1 so F(4) so work it down like a tree F(3) = F(2) + F(1)
and F(2) = F(1) + F(0) and given the base case condition of n < 2 it would be F(2) = 1 and F(3) = 2 and 1 + 2 is none other than 3!!! again the F(4) is not the number in the fib sequence rather than just the ''place''.
 You can look up the sequence and get a decent grasp on the pattern and the places and the numbers in those places once you get that you just have to understand what the n in your function represents the place,
 dont worry about numberss just know that the 4th place (or any nth place) has to equal its respective number and find out what two numbers would make sense this way of doing it can be tricky if you dont fully grasp the pattern
 or if you start with the 19th place because there are lots of integers that can add to equal 4181, So starting with that lower sequence will make alot more sense. Then once you you'll realize the places before the current place have to be
 added together and thats where n-1 and n-2 since if you look at the sequence on wiki youll notice 1, 2 add up to 3. */
