import javax.swing.*;
import java.util.Scanner;

public class BombOrBills {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int swapTime = sc.nextInt();
        sc.nextLine();
        char[][] data = new char[rows][columns];
        for(int i=0;i<rows;i++){
            String c = sc.nextLine();
            data[i] = c.toCharArray();
        }
        for(int j =0;j<rows;j++){

        }




    }

    private static boolean check(char[] data, int rows, int columns){
        for(int i=0;i<rows;i++){
            if(!Character.isDigit(data[i])){
                
            }
        }
        return true;
    }


}
