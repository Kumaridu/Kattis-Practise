package DPPractise;

import java.util.Scanner;

public class FibonacciReq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] memoize = new int[num+1];

        System.out.println("nth Fibonanci No: "+ calcFibo(memoize,num));
    }

    private static int calcFibo(int[] series, int num){
        if(num < 2) {
            return num;
        }

        if(series[num] != 0){
            return series[num];
        }
        return calcFibo(series,num-1) + calcFibo(series,num-2);
    }
}
