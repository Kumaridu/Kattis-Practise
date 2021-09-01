import java.util.ArrayList;
import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int event = sc.nextInt();
        ArrayList<Integer> freeFoodServedDays = new ArrayList<>();
        for(int i = 0;i< event;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start; j<=end;j++){
                if(!freeFoodServedDays.contains(j)){
                    freeFoodServedDays.add(j);
                }
            }
        }
        System.out.println(freeFoodServedDays.size());
    }

}
