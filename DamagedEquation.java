import java.util.Scanner;

public class DamagedEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] digits = num.split(" ");
        String operators[] = {"*", "+", "-", "/"};
        boolean solution = false;
        int a = Integer.parseInt(digits[0]);
        int b = Integer.parseInt(digits[1]);
        int c = Integer.parseInt(digits[2]);
        int d = Integer.parseInt(digits[3]);

        for(int i = 0; i < 4; i++){
            for(int j = 0;j < 4; j++){
                int leftSide = calc(a ,b , operators[i]);
                int rightSide = calc(c, d , operators[j]);
                if(leftSide == rightSide){
                    solution = true;
                    System.out.println(a + " " + operators[i] + " " + b + " = " + c + " "+ operators[j] +" "+ d);
                }
            }
        }
       if(!solution) {
           System.out.println("problems ahead");
       }
    }

    private static int calc(int firstDigit, int secondDigit, String operator){

        if(operator.equals("*")){
            return firstDigit * secondDigit;
        } else if(operator.equals("/")){
            return firstDigit / secondDigit;
        } else if(operator.equals("+")){
            return firstDigit + secondDigit;
        } else if(operator.equals("-"))
            return firstDigit - secondDigit;
        return Integer.MAX_VALUE;
    }
}
