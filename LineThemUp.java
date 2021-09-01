import java.util.Scanner;

public class LineThemUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean increasing = false;
        boolean decreasing = false;
        int count = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        for(int i=0; i<count-1; i++){
            String otherName = sc.nextLine();
            if(name.compareTo(otherName) > 0){
                decreasing = true;
            } else {
                increasing = true;
            }
            name = otherName;
        }
        if(increasing == true && decreasing == false){
            System.out.println("INCREASING");
        } else if(decreasing == true && increasing == false){
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
