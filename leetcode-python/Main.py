
from Quests.Stack import Solution
import time

solution:Solution = Solution()

#nums:list[int] = [1,2,3]
tokens: list[str] = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]

start: float = time.perf_counter()

#output: list[str] = solution.buildArray(nums, 3)
output: int = solution.evalRPN(tokens)

end: float = time.perf_counter()

print(output)
print(f"TIME: {end - start}")


