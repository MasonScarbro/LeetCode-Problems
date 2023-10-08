class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        i = 0
        uniques = []
        lengthBefore = len(nums)

        for num in nums:
            if num not in uniques:
                uniques.append(num)
      
        nums[:] = uniques
        lengthAfter = len(nums)
        print(lengthAfter)
        while i < lengthBefore - lengthAfter:
            nums.append(0)
            i = i+1

        print(nums)
        print(nums[:lengthAfter])

        return lengthAfter
