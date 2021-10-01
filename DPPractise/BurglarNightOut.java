package DPPractise;

public class BurglarNightOut {
    private int calculateMaxMoney(int house[]){
        int size = house.length;
        int maxMoney[] = new int[size+1];
        maxMoney[size] = 0;
        maxMoney[size-1] = house[size-1];
        if(size == 0){
            return 0;
        }
        for(int i=size-2;i>=0;i--){
            maxMoney[i] = Math.max(house[i]+maxMoney[i+2],maxMoney[i+1]);
        }
        return maxMoney[0];
    }
    private int robHouses(int[] houses){
        int length = houses.length;

        if(length == 0){
            return 0;
        }

        // Initializing maxMoney[n+1] array
        int[] maxMoney = new int[length + 1];

        // Defining the base cases
        maxMoney[length] = 0;
        maxMoney[length - 1] = houses[length - 1];

        // Making the general recurrence relation
        for(int i = length - 2; i >= 0; i--){
            maxMoney[i] = Math.max(houses[i] + maxMoney[i + 2], maxMoney[i + 1]);
        }

        // Returning the maximum money that we can make from house no. 0 onwards
        return maxMoney[0];
    }
    public static void main(String[] args) {
        BurglarNightOut night = new BurglarNightOut();
        int[] houses = {3, 8, 10, 4, 1, 7, 2};
        int[] excludeLastHouse = {3,8,10,4,1,7};
        int[] excludeFirstHouse = {8,10,4,1,7,2};
        int first = night.robHouses(excludeFirstHouse);
        int second = night.robHouses(excludeLastHouse);
        System.out.println(first+" "+ second);
        System.out.println(Math.max(first,second));
    }
}
