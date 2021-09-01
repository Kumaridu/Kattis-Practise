import java.util.Scanner;

public class Quality_adjusted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float qual = 0;
        for(int i=0;i<num;i++){
            float qualityOfLife = sc.nextFloat();
            float years = sc.nextFloat();
          qual += (float) (qualityOfLife * years);
        }
        System.out.printf("%.3f", qual);
    }

}
