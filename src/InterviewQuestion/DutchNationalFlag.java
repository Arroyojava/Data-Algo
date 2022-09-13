package InterviewQuestion;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {

        int[] nums = {2, 2, 0, 1, 0, 1, 0, 2, 1, 0, 1, 0, 1, 2, 0, 1, 2, 0, 0, 1, 2};
        System.out.println(Arrays.toString(nums));
        dutchFlag(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void dutchFlag(int[] nums) {

        int i = 0;
        int j = 0;
        int pivot = 1;
        int k = nums.length - 1;

        while (j <= k) {
            // When item = 0
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
                j++;
                // When item = 2
            } else if (nums[j] > pivot) {
                swap(nums, j, k);
                k--;
                // When item = 1
            } else
                j++;
        }

    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
