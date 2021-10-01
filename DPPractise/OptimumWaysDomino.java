package DPPractise;

public class OptimumWaysDomino {
    int prev1 = 1;int prev2 = 1;
    private int maxWays(int n){
        for(int i=2;i<=n;i++){
            int temp = prev2;
            prev2 = prev1 + prev2;
            prev1 = temp;
        }
        return prev2;
    }
    public static void main(String[] args) {
        OptimumWaysDomino domino = new OptimumWaysDomino();
        System.out.println(domino.maxWays(5));
    }
}
