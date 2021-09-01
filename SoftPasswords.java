import java.util.Scanner;

public class SoftPasswords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String storePassword = sc.nextLine();
        String enteredPassword = sc.nextLine();
        enteredPassword = enteredPassword.toLowerCase();
        storePassword = storePassword.toLowerCase();
        char first = storePassword.charAt(0);
        char second = storePassword.charAt(storePassword.length()-1);

        if ((first + enteredPassword).equals(storePassword) && Character.isDigit(first) ||
                (enteredPassword + second).equals(storePassword) && Character.isDigit(second)) {

            System.out.println("Yes");
        } else if (storePassword.equals(enteredPassword)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

