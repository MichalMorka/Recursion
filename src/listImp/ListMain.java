package listImp;

import java.util.List;
import java.util.Random;

public class ListMain {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayList2x<>(); //zmiana ArrayList2x na LinkedList
        Random rand = new Random();
        int numbersCount = 10;
        for (int i = 0; i < numbersCount; i++)
            list.add(rand.nextInt(101)); // generujemy losowe liczby do listy

        ListUtilities.display(list); // wyswietlam liste
        list.add(11,2);
        ListUtilities.display(list);
        list.remove(9);
        ListUtilities.display(list);
    }
}
