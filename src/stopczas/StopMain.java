package stopczas;

import babol.TableUtilities;

public class StopMain {
    public static void main(String[] args) {
        int repetitions = 10000;
        int[] tab = TableUtilities.createAndFillTable(1000000,0,100);
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        for(int i=0; i < repetitions; i++);
            addValue(tab);
        System.out.println(stopwatch.stop()/repetitions);
    }

    private static void addValue(int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] *=2;
        }
    }
}