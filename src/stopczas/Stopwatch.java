package stopczas;

import java.util.SortedMap;
import java.util.concurrent.TimeUnit;

public class Stopwatch {
    private long startTime;

    public void start() {
        startTime = System.nanoTime();
        long elapsedNanos = System.nanoTime() - startTime;
    }

    public long stop() {
        return System.nanoTime() - startTime;
        // return TimeUnit.MILLISECONDS.convert(System.nanoTime() - startTime,TimeUnit.NANOSECONDS);
    }
}