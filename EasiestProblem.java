import java.util.Scanner;

public class EasiestProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            int p = 11;
            int numDigitSum = 0;
            boolean getPair = false;
            char[] digits = Integer.toString(num).toCharArray();
            for (int j = 0; j < digits.length; j++) {
                numDigitSum += Integer.parseInt(String.valueOf(digits[j]));
            }
            while(getPair != true && numDigitSum !=0) {
                int sum = 0;
                int multiply = num * p;
                char[] mulDigits = Integer.toString(multiply).toCharArray();
                for (int j = 0; j < mulDigits.length; j++) {
                    sum += Integer.parseInt(String.valueOf(mulDigits[j]));
                }
                if(numDigitSum == sum){
                    getPair = true;
                    System.out.println(p);
                }
                p++;
            }
        } while(num != 0);
    }
}
