
// Problems : 1. Two Sum
export function twoSum(nums: number[], target: number): number[] {

    let seenNumbers: Map<number, number> = new Map();

    for (let i = 0; i < nums.length; i++) {
        let complement: number = target - nums[i];

        if (seenNumbers.has(complement)) {
            return [i, seenNumbers.get(complement)!];
        }

        seenNumbers.set(nums[i], i);
    }

    return [];
}