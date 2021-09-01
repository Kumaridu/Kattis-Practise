import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  encodedWords = sc.nextLine();
        List<String> vowelsDecodes = new ArrayList<>(Arrays.asList("apa","epe","ipi","opo","upu"));
        String[] vowels = {"a","e","i","o","u"};
        for(int i = 0;i< vowels.length; i++){
            encodedWords = encodedWords.replaceAll(vowelsDecodes.get(i), vowels[i]);
        }

        System.out.println(encodedWords);
    }
}
