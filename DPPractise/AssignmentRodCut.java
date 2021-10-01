package DPPractise;

public class AssignmentRodCut {
    private int countWays(int cost[], int n){
        int rod[] = new int[n+1];
        rod[0] = 0;
        int possibilities[] = new int[n+1];
        possibilities[0] = 1;

        for (int i=1; i<=n; i++){
            int max_Value = Integer.MIN_VALUE;
            for(int j=1; j<=i; j++){
              if( max_Value  < cost[j] + rod[i-j] ){
                  max_Value = cost[j] + rod[i-j];
                  possibilities[i] = possibilities[i-j];

              }else if(max_Value == cost[j] + rod[i-j]){
                  possibilities[i] = possibilities[i] + possibilities[i-j];
              }
            }
            rod[i] = max_Value;
        }
        return possibilities[n];
    }

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
        AssignmentRodCut assignment = new AssignmentRodCut();
        int cost[] = {0,2,4,6,8,9};
//        System.out.println("Max Profit: "+ assignment.maxProfit(cost, 5));
        System.out.println("Possibilites: "+ assignment.countWays(cost,5));
    }
}
