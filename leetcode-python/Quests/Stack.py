

class Solution:

    #Stack : Q1. Build an Array With Stack Operations
    def buildArray(self, target: list[int], n: int) -> list[str]:

        output: list[str] = []
        gen = (i for i in range(1, n+1))

        for num in target:
            for j in gen:
                if j != num:
                    output.append("Push")
                    output.append("Pop")
                else:
                    output.append("Push")
                    break

        return output


    #Stack : Q2. Evaluate Reverse Polish Notation
    def evalRPN(self, tokens: list[str]) -> int:

        output: list[int] = []

        for token in tokens:
            if token not in ["+", "-", "*", "/"]:
                output.append(int(token))
            else:
                number_b: int = output.pop()
                number_a: int = output.pop()

                # #using if / else
                # if token == "+":
                #     result: int = number_a + number_b
                # elif token == "-":
                #     result: int = number_a - number_b
                # elif token == "*":
                #     result: int = number_a * number_b
                # else:
                #     result: int = int(number_a / number_b)

                #Using macth / case
                match token:
                    case "+":
                        result: int = number_a + number_b
                    case "-":
                        result: int = number_a - number_b
                    case "*":
                        result: int = number_a * number_b
                    case "/":
                        result: int = int(number_a / number_b)

                output.append(result)

                ##Using EVAL
                #output.append(int(eval(f"{number_a} {token} {number_b}")))

        return output[0]


    #Stack : Q3. Exclusive Time of Functions
    def exclusiveTime(self, n: int, logs: list[str]) -> list[int]:
        pass
        #
        # log: tuple[str, ...] = tuple(logs.pop().split(sep=":"))
        #
        # id: int = int(log[0])
        # stamp: int = int(log[2])
        #
        # stack: list[int] = [id]
        #
        # for item in reversed(logs):
        #     log = tuple(item.split(":"))
        #
        #     if log[1] == "end":
        #         for i in range(stamp - int(log[2])):
        #             stack.append()
        #
        #
        #         id = log[0]
        #     else:





