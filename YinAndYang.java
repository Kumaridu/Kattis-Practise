import java.util.Scanner;

public class YinAndYang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stones = sc.nextLine();
        int blackStone = 0, whiteStone = 0;
        for(int i = 0;i< stones.length();i++){
            if(stones.charAt(i) == 'W'){
                whiteStone += 1;
            } else {
                blackStone += 1;
            }
        }
        if(blackStone == whiteStone){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
