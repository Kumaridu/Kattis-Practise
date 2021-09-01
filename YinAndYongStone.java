import java.util.Scanner;

public class YinAndYongStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stonesCircle = sc.nextLine();

        while(stonesCircle.length() > 2){
            int blackStone = 0;
            int whiteStone = 0;
            String subSequenceStones = stonesCircle.substring(0,3);
            for(int i=0;i<subSequenceStones.length();i++){
                if(subSequenceStones.charAt(i) == 'W'){
                    whiteStone +=1;
                } else {
                    blackStone +=1;
                }
            }
            if(whiteStone == 2 && blackStone == 1){
                stonesCircle = stonesCircle.replace(subSequenceStones, "W");
                System.out.println("This is original Seq: " +stonesCircle);
            } else if (blackStone == 2 && whiteStone == 1){
                stonesCircle = stonesCircle.replace(subSequenceStones, "B");
            }
            System.out.println(stonesCircle);
            System.out.println("white: "+ whiteStone+" "+ "Black: "+ blackStone);
        }

    }
}
