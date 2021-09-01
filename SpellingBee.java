import java.util.ArrayList;
import java.util.Scanner;

public class SpellingBee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int numWord = sc.nextInt();
        sc.nextLine();
        ArrayList<String> words = new ArrayList<>();
        for(int i=0;i< numWord;i++){
            String dictionaryWord = sc.nextLine();
            String centerLetter = String.valueOf(word.charAt(0));
            if(!dictionaryWord.contains(centerLetter)){
                continue;
            }
            if(dictionaryWord.length() < 4){
                continue;
            }

            if(matchingLetter(word,dictionaryWord)){
                words.add(dictionaryWord);
            }
        }
        for(String value: words){
            System.out.println(value);
        }
    }

    private static boolean matchingLetter(String word,String dictionaryWord) {
        for(int j = 1; j< dictionaryWord.length(); j++){
            String temp = String.valueOf(dictionaryWord.charAt(j));
            if(!word.contains(temp)){
                return false;
            }
        }
        return true;
    }
}
