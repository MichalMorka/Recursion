package zadRozgPowRek;
//program liczy NWD
import java.util.Scanner;

public class zadRozgPowRekMain {
    public static void main(String[] args) {
        System.out.println("podaj pierwsza liczbe");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int b = scanner.nextInt();



        if (a == b) {
            System.out.println("NWD to: " + a);
        } else if (a > b) {
          a = a - b;
            System.out.println("NWD to: " + a);
        } else {
            b = b - a;
        }


    }
}
