package DPPractise;

public class LongestIncreasing {
    public int longestSubSequence(int[] nums){
        int size = nums.length;
        int maxLength = 0;
        int[] longestSubSequence = new int[size];
        int lastElement = 0;
        longestSubSequence[0] = -1;
        int[] lis = new int[size];
        String[] subNumbers = new String[size];
        for(int i=0;i< lis.length;i++){
            lis[i] = 1;
        }

        for(int i=1;i<lis.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]  && lis[i]< lis[j] +1 ){
                    lis[i] = lis[j]+1;
                    longestSubSequence[i] = j;
                }
            }
        }
        for(int i=0;i<lis.length;i++){
            if(maxLength < lis[i]){
                maxLength = lis[i];
                lastElement = i;
            }
        }

        while(lastElement != -1){
            System.out.println(nums[lastElement]);
            lastElement = longestSubSequence[lastElement];
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestIncreasing subSequence = new LongestIncreasing();
        int nums[] = {11,23,10,37,21,50,80};
        System.out.println("Maximum SubSequence is :"+ subSequence.longestSubSequence(nums));
    }
}
