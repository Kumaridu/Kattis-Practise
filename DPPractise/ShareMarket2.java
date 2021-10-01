package DPPractise;

public class ShareMarket2 {
    private int calcMaxProfit(int[] prices){
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i< prices.length;i++){
            for(int j=i+1; j< prices.length; j++){
                maxProfit = Math.max(prices[j]-prices[i],maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {8,1,2,4,6,3};
        ShareMarket2 shareMarket = new ShareMarket2();
        System.out.println(shareMarket.calcMaxProfit(prices));
    }
}
