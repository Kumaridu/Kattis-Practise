package DPPractise;


public class OnTheWayHome {
    private int calculateWays(int m, int n){
        int ways[][] = new int[m][n];

        for(int i=0;i<n;i++){
            ways[m-1][i] = 1;
        }

        for(int j=0;j<m;j++){
            ways[j][n-1] = 1;
        }

        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                ways[i][j] = ways[i+1][j] + ways[i][j+1];
            }
        }

        return ways[0][0];
    }
    public static void main(String[] args) {
        OnTheWayHome wayHome = new OnTheWayHome();
        System.out.println("Number of ways to go home: "+ wayHome.calculateWays(4,3));
    }
}

