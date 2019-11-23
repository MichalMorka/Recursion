package pow2;

public class Pow {
    public int pow(int n) {
        if (n==0)
            return 1;
        int value = pow(n-1);
        return 2* value;

        //return n == 0 ? 1 : 2 * pow(n-1);

    }
}
