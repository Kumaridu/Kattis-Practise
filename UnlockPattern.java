import java.util.*;

public class UnlockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points[][] = new int[3][3];
        int initPoint[] = new int[2];
        for(int x=0; x<3; x++){
            for(int y=0; y<3; y++){
                points[x][y] = sc.nextInt();
                if(points[x][y] == 1) {
                    initPoint[0] = x;
                    initPoint[1] = y;
                }
            }
        }

        double distance = 0;
        int nextPoint[] = new int[2];
        for(int num = 1; num < 9; num++){
            for(int x=0; x<3; x++)
                for(int y=0; y<3; y++)
                    if(points[x][y] == num+1) {
                        nextPoint[0] = x;
                        nextPoint[1] = y;
                    }

            distance += Math.sqrt(Math.pow(nextPoint[0] - initPoint[0], 2) + Math.pow(nextPoint[1] - initPoint[1], 2));
            initPoint[0] = nextPoint[0];
            initPoint[1] = nextPoint[1];
        }
        System.out.println(distance);
    }
}