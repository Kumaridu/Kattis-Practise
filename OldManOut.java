import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OldManOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0;i<test;i++){
            int guests = sc.nextInt();
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
          for(int j = 0;j<guests;j++){
              int invitationNo = sc.nextInt();
             if(!even.contains(invitationNo)){
                 even.add(invitationNo);
             } else {
                 odd.add(invitationNo);
             }
           }
            Optional<Integer> couple = even.stream()
                    .filter(e -> !odd.contains(e)).findAny();
            if(couple.isPresent()){
                System.out.println("Case #"+ (i+1) +": "+ couple.get());
            }
        }
    }
}
