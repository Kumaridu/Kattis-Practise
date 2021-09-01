
class GFG
{
    static int decimalToBinary(int N)
    {

        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0)
        {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;
            cnt++;
        }

        return B_Number;
    }

    public static void main (String[] args)
    {

        int N = 17;
        System.out.println (decimalToBinary(N));

    }
}

