import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MusicalScale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotes = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        int[] major = {2, 2, 1, 2, 2, 2, 1};
        int curr = 0;
        boolean exists = false;
        //each major
        major:
        for (int i = 0; i < notes.length; i++) {
            curr = i;
            HashSet<String> hs = new HashSet<>(Arrays.asList(input));
            //System.out.print(notes[i] + " ");
            //stepping in major
            for (int j = 0; j < major.length; j++) {
                curr += major[j];
                hs.remove(notes[curr % notes.length]);
                if (hs.isEmpty()) {
                    System.out.print(notes[i] + " ");
                    exists = true;
                    continue major;
                }
            }
            //System.out.print(notes[curr%notes.length] + " ");
        }
        if (!exists) {
            System.out.println("none");
        }
    }
}
