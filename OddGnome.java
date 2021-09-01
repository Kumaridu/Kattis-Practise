import java.util.Scanner;

public class OddGnome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        for(int i=0; i<group; i++){
            int num = sc.nextInt();
            int members[] = new int[num];
            for(int j=0; j<num;j++){
                members[j] = sc.nextInt();
              }

            for(int k=1;k< members.length;k++){
                if(!(members[k] - members[k-1] == 1)){
                    System.out.println(k+1);
                    break;
                }
            }
        }
    }
}
