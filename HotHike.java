import java.util.Scanner;

public class HotHike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();
        int[] dayTem = new int[totalDays];
        for(int i=0; i<totalDays; i++){
            dayTem[i] = sc.nextInt();
        }

        float size = (float) dayTem.length/2;
        int intSize = (int)Math.ceil(size);
        int[] maxTem = new int[intSize];
        int min = Integer.MAX_VALUE;
        int day = 0;
        for(int j=0; j<intSize; j++){
            for(int k=j; k<dayTem.length; k++){
                maxTem[j] = Math.max(dayTem[k],dayTem[k+2]);
                if(maxTem[j] < min){
                    min = maxTem[j];
                    day = j+1;
                }
                break;
            }
        }
        System.out.println(day+ " " +min);
    }
}
