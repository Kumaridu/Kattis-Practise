package DPPractise;

import java.util.ArrayList;

public class LongestIncreasingSubSequence {
    private int longestSubSequence(int[] nums){
        int size = nums.length;
        int maxLength = 0;
        int maxValue = 0;
        int[] lis = new int[size];
        String[] subNumbers = new String[size];
        for(int i=0;i< lis.length;i++){
            lis[i] = 1;
            subNumbers[i] = "";
        }

        for(int i=1;i<lis.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]  && lis[i]< lis[j] +1 ){
                    lis[i] = lis[j]+1;
                    subNumbers[i] += Integer.toString(nums[j]);
                }
            }

            subNumbers[i] += Integer.toString(nums[i]);
            if(maxLength < lis[i]){
                maxLength = lis[i];
                maxValue = i;
            }
        }
        System.out.println(subNumbers[maxValue]);
        return maxLength;
    }
    public static void main(String[] args) {
        LongestIncreasingSubSequence subSequence = new LongestIncreasingSubSequence();
        int nums[] = {11,23,10,37,21,50,80};
        System.out.println("Maximum SubSequence is :"+ subSequence.longestSubSequence(nums));
    }
}
