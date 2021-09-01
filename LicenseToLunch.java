import java.util.Scanner;

public class LicenseToLunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int min = Integer.MAX_VALUE, waitDay = 0;
        for(int i = 0;i<days;i++){
            int junk = sc.nextInt();
            if(junk < min){
                min = junk;
                waitDay = i;
            }
        }
        System.out.println(waitDay);
    }
}
