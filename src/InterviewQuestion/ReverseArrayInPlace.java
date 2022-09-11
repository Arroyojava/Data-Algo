package InterviewQuestion;

import java.util.Arrays;

public class ReverseArrayInPlace {

    public static void main(String[] args) {
/*
    The problem is that we want to reverse a T[] array in O(N) linear time complexity
    we want the algorithm to be in-place as well - so the algorithm can not use additional memory!
    For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
 */
        int[] number = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(number));
        solve(number);
        System.out.println(Arrays.toString(number));

    }

    // no need for extra memory (in-place algorithm)
    // O(n/2) = O(n) linear running time
    public static void solve(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
    }

    public static void swap(int[] nums, int lowIndex, int highIndex) {
        int temp = nums[lowIndex];
        nums[lowIndex] = nums[highIndex];
        nums[highIndex] = temp;
    }

}
