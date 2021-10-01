package DPPractise;

public class RodCutter {
    private int maxProfit(int prices[],int rodLength){
        int[] rod = new int[rodLength+1];
        rod[0] = 0;

        for(int i=1;i<=rodLength; i++){
            int max = Integer.MIN_VALUE;
            for(int j=1;j<=i;j++){
                max = Math.max(max, prices[j]+ rod[i-j]);
            }
            rod[i] = max;
        }
        return rod[rodLength];
    }

    public static void main(String[] args) {
       RodCutter rot = new RodCutter();
       int[] cost = {0, 2, 4, 7, 8};
        System.out.println("Max rod cutter: " + rot.maxProfit(cost,4));
    }
}
