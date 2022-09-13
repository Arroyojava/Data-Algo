package InterviewQuestion;

public class TrappingRainWater {
    public static void main(String[] args) {

        // 8
        int[] heights = {1,0,2,1,3,1,2,0,3};

        // 3
        int[] heights2 = {2,1,3,1,4};

        // 7
        int[] heights3 = {4,1,3,1,5};


        System.out.println(rainWater(heights));
        System.out.println(rainWater(heights2));
        System.out.println(rainWater(heights3));

    }

    // has O(n) running time (with additional O(n) memory complexity
    // dynamic programming approach - memorization
    public static int rainWater(int[] height){

        // Less than 3 bars can not trap water
        if (height.length < 3)
            return 0;

        // Create arrays for the max left and right values
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        // Calculate the left max values (from left to right)
        // Set first item to zero
        leftMax[0] = 0;
        for (int i = 1; i < leftMax.length; i ++){
            leftMax[i] = Math.max(leftMax[i -1], height[i-1]);
        }

        // Calculate the right max values (from right to left)
        // Set last item to 0
        rightMax[rightMax.length-1] = 0;
        for(int i = rightMax.length-2; i >=0; i--){
            rightMax[i] = Math.max(rightMax[i +1], height[i + 1]);
        }

        // Consider all the items in O(n) running time
        int trapped = 0;

        for (int i =1; i < height.length-1; i++){
            int min = Math.min(leftMax[i], rightMax[i]);
            if (min > height[i]){
                trapped += min - height[i];
            }
        }

        return trapped;

    }


}
