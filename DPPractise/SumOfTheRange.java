package DPPractise;

import java.util.Scanner;

public class SumOfTheRange {
    private int[] sumUntil(int[] value){
        int size = value.length;
        int sumUntil[] = new int[size];
        sumUntil[0] = value[0];
        for(int i=1;i<value.length;i++){
            sumUntil[i] = sumUntil[i-1] + value[i];
        }
        return sumUntil;
    }

    private int sumOfRange(int init, int end, int[] sumUntil) {
        if(init == 0) {
            return sumUntil[end];
        } else {
            return sumUntil[end] - sumUntil[init -1];
        }
    }

    public static void main(String[] args) {
        int value[] = {1,-2,3,10,-8,0};
        SumOfTheRange range = new SumOfTheRange();
        Scanner sc = new Scanner(System.in);
        int sumUntil[] = range.sumUntil(value);
        while(sc.hasNext()){
            int init = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(range.sumOfRange(init, end, sumUntil));
        }

    }
}
