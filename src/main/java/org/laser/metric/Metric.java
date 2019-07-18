package org.laser.metric;

import java.time.Instant;
import java.time.Duration;

public class Metric {
    public static long elapsedMillis(Runnable r) {
        Instant start = Instant.now();
        r.run();
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }
}
