package DPPractise;

import java.util.ArrayList;

public class StairwayToHeaven2
{

    public static void main(String args[]) {

        StairwayToHeaven2 sth2 = new StairwayToHeaven2();
        int[] fee = {2, 1, 3, 1, 2};
        System.out.println(sth2.optimumWay(fee, 5));
    }



    private int optimumWay(int[] fee, int n){
        int[] minFee = new int[n + 1];
        // Base cases
        int[] previous = new int[n + 1];
        previous[0] = -1;
        previous[0] = previous[1] = 0;
        minFee[0] = 0;
        minFee[1] = minFee[2] = fee[0];

        // 'i' sets the stair number
        for(int i = 3; i <= n; i++){
            // general recurrence relation
            minFee[i] = Math.min(minFee[i - 1] + fee[i - 1], Math.min(minFee[i - 2] + fee[i - 2], minFee[i - 3] + fee[i - 3]));
            if(minFee[i] == minFee[i-1] + fee[i - 1]){
                previous[i] = i-1;
            } else if(minFee[i] == minFee[i - 2] + fee[i - 2]){
                previous[i] = i-2;
            } else {
                previous[i] = i-3;
            }
        }

        int j = n;
        while(j != 0){
            System.out.print(j+ "->");
            j = previous[j];
        }
        System.out.println(0);

        return minFee[n];
    }

}
