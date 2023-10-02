class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = " ".join(s.split())
        arrOfWords = s.split(" ")
        arrOfWords.reverse()
        s = " ".join(arrOfWords)
        return s
