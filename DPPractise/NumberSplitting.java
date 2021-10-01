package DPPractise;

import java.util.ArrayList;

public class NumberSplitting {
    private int calculateMaxProduct(int n){
        int[] maxProduct = new int[n+1];
        maxProduct[1] = 0;
        maxProduct[2] = 1;

        for(int i=3; i<=n;i++){
            for(int j=1; j<i-1;j++){
                maxProduct[i] = Math.max(j* maxProduct[i-j],Math.max(j*(i-j),maxProduct[i]));
            }
        }
        return maxProduct[n];
    }

    private int findAllPossibleMaxProduct(int n){
        int[] maxProduct = new int[n+1];
        maxProduct[1] = 0;
        maxProduct[2] = 1;

        ArrayList<Integer> products = new ArrayList<>();
        for(int i=3; i<=n;i++){
            for(int j=1; j<i-1; j++){
                int first = j* maxProduct[i-j];
                int second = j*(i-j);
                maxProduct[i] = Math.max(first,Math.max(second,maxProduct[i]));
                if(!products.contains(first) && first != 1){
                    products.add(first);
                }
                if(products.contains(second) && second != 1){
                    products.add(second);
                }
            }
        }
        System.out.println(products);
        return maxProduct[n];
    }
    public static void main(String[] args) {
        NumberSplitting splitting = new NumberSplitting();
        System.out.println(3* splitting.calculateMaxProduct(8-3));
    }
}
