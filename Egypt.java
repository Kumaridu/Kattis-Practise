import java.util.Scanner;

public class Egypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextDouble();
            if(a==0 && b==0 && c==0){
                break;
            }
            if(a>b){
                double temp = a;
                a = b;
                b = temp;
            }
            if(b>c){
                double temp = b;
                b = c;
                c = temp;
            }
            c = Math.pow(c,2);
            if(Math.pow(a,2) + Math.pow(b,2) == c){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
 }


}
