package babol;

public class BubbleSort {
    public void sort(int[] t) {
        boolean swaped = false;
        do {
            swaped = false;
            for (int i = 0; i < t.length - 1; ++i) {
                if (t[i] > t[i + 1]) {
                    swap(t, i, i + 1);
                    swaped = true;
                }
            }
        } while (swaped);
    }

    private void swap(int[] table, int ind1, int indl2) {
        int tmp = table[ind1];
        table[ind1] = table[indl2];
        table[indl2] = tmp;
    }
}