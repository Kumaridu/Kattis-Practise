package DPPractise;

public class StairyHeaven {
    public int stairToHeaven(int stair){
        int[] storeWays = new int[stair+1];

        storeWays[0] = 1;
        storeWays[1] = 1;

        for(int i =2; i<= stair; i++){
            storeWays[i] = storeWays[i-1] + storeWays[i-2];
        }
        return storeWays[stair];
    }

    public static void main(String[] args) {
        StairyHeaven stair = new StairyHeaven();
        System.out.println(stair.stairToHeaven(4));
    }
}
