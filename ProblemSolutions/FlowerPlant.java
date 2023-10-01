class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        
        for (int i = 1; i < flowerbed.length - 1; i++){
            
            if(flowerbed[flowerbed.length-1] ==0 && flowerbed[flowerbed.length-2] == 0){
                count++;
            }
            if (flowerbed[i] == 0){
                if (flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1){
                    
                flowerbed[i] = 1;
                count++;
                }
            }
            

        }
        
        
        System.out.println(count);
        if (flowerbed.length == 1 && flowerbed[0] == 0) return true;
        if(flowerbed[0] ==0 && flowerbed[1] == 0){
                count++;
                flowerbed[0] = 1;
        }
        if (count >= n){
            return true;
        } else return false;
    }

// 97/127 test cases passed | Timer reached 2 hours, couldnt handle edge cases this was the best result.
