package DPPractise;

public class DominoArrangements {
    private int maxWays(int columns){
        int ways[] = new int[columns+1];
        int size = ways.length;
        ways[0] = 1;
        ways[1] = 1;
        for(int i=2;i<=columns;i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[columns];
    }
    public static void main(String[] args) {
        DominoArrangements arrangements = new DominoArrangements();
        System.out.println("ways: "+arrangements.maxWays(5));
    }
}
