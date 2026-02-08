class Solution:

    #Array II : Q1. Set Mismatch
    def findErrorNums(self, nums: list[int]) -> list[int]:
        n: int = len(nums)

        expected_sum: int = (n * (n + 1)) // 2
        actual_sum: int = sum(nums)

        duplicate: int = actual_sum - sum(set(nums))
        missing: int = expected_sum + duplicate - actual_sum

        return [duplicate, missing]


    #Array II : Q2. How Many Numbers Are Smaller Than the Current Number
    def smallerNumbersThanCurrent(self, nums: list[int]) -> list[int]:
        sorted_nums: list[int] = sorted(nums)

        return [sorted_nums.index(i) for i in nums]


    #Array II : Q3. Find All Numbers Disappeared in an Array
    def findDisappearedNumbers(self, nums: list[int]) -> list[int]:
        output:list[int] = []
        numbers:set[int] = set(nums)

        for i in range(1, len(nums) + 1):
            if i not in numbers:
                output.append(i)

        return output