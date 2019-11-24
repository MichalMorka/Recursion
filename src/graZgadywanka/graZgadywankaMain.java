package graZgadywanka;

import java.util.Random;
import java.util.Scanner;

public class graZgadywankaMain {
    public static void main(String[] args) {
        Random losowaLiczba = new Random(99);

        for (int i = 0; i == 7; i++) {
            System.out.println("proba nr: " + i +"/7");
            System.out.println("zgadnij liczbe: ");
            Scanner scanner = new Scanner(System.in);
            int mojaLiczba = scanner.nextInt();

//            if (mojaLiczba < losowaLiczba) {
//                System.out.println("przegrałes, twoja liczba jest mniejsza od losowej");
//            } else if (mojaLiczba > losowaLiczba) {
//                System.out.println("przegrałes, twoja liczba jest wiekszaod losowej");
//            } else {
//                System.out.println("wygrales");
//            }
            System.out.println("koniec, wylosowana liczba to: "+losowaLiczba);
        }

    }
}
