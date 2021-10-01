package DPPractise;

public class ShareMarket {
    private int calcMaxProfit(int prices[]){
        int size = prices.length;
        int minProfitUptilNow[] = new int[size];
        int maxProfit[] = new int[size];
        int maximumProfit = Integer.MIN_VALUE;
        minProfitUptilNow[0] = prices[0];
        for (int i=1; i< maxProfit.length; i++){
            minProfitUptilNow[i] = Math.min(minProfitUptilNow[i-1],prices[i]);
        }

        for(int i=0;i< maxProfit.length;i++){
            maxProfit[i] = prices[i] - minProfitUptilNow[i];
            if(maxProfit[i] > maximumProfit) {
                maximumProfit = maxProfit[i];
            }
        }

        return maximumProfit;
    }
    public static void main(String[] args) {
        int prices[] = {8,1,2,4,6,3};
        ShareMarket shareMarket = new ShareMarket();
        System.out.println(shareMarket.calcMaxProfit(prices));
    }
}
