package rabbits;

public class RabFib {
    public static void main(String[] args) {
            FibCounter fb = new FibCounter();
            int n = 10;
            System.out.println("iter: " + fb.fibIter(n));
            System.out.println("recur: " + fb.fibRec(n));
        }

    }
