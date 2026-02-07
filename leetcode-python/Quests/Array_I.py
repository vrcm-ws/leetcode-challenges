class Solution:

    #Array I : Q1. Concatenation of Array
    def getConcatenation(self, nums: list[int]) -> list[int]:
        lenght: int = len(nums)
        output: list[int] = [0] * lenght * 2

        for i in range(0, lenght):
            output[i] = nums[i]
            output[lenght + i] = nums[i]

        return output

    #Array I : Q2. Shuffle the Array
    def shuffle(self, nums: list[int], n: int) -> list[int]:
        output: list[int] = [0] * n * 2

        for i in range(n):
            output[i * 2] = nums[i]
            output[i * 2 + 1] = nums[i + n]

        return output

    #Array I : Q3. Max Consecutive Ones
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:

        max_occurence: int = 0
        current_occurence: int = 0

        for num in nums:

            if num == 1:
                current_occurence += 1
            else:

                if current_occurence > max_occurence:
                    max_occurence = current_occurence

                current_occurence = 0

        return max(max_occurence, current_occurence)
