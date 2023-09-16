class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] List = new Boolean[candies.length];
        
        for (int i = 0; i < candies.length; i++){
            int kids = 0;
            for (int kid : candies){
                if (candies[i] + extraCandies >= kid ){
                    kids++;
                    if (kids == candies.length){
                        List[i] = true;
                    }
                } else {
                    List[i] = false;
                }
            }
        }
            List<Boolean> arrayList = new ArrayList<>(Arrays.asList(List));
            return arrayList;
    }
}
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/4053109/solving-in-the-worst-runtime-possible/ //
