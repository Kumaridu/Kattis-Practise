import java.util.Scanner;

public class AnthonyAndDiablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area = sc.nextFloat();
        float side = sc.nextFloat();
        //a circle is the least area covering geometrical shape.
        double radius = side / (Math.PI * 2);
        double calculatedArea = Math.PI * Math.pow(radius,2);
        if(calculatedArea >= area){
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
}
