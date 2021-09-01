import java.util.ArrayList;
import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String duplicate = sc.nextLine();
        String[] words = duplicate.split(" ");
        ArrayList<String> uniqueString = new ArrayList<>();
        for(int i=0; i< words.length; i++){
            if(!uniqueString.contains(words[i])){
                uniqueString.add(words[i]);
            } else {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");


    }
}

