class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (sorted(s) == sorted(t)):
            return True

// I actually did this in java and truthfully its not that mush longer its about 8 lines but stille basically 2 lines to compare two arrays is insane
