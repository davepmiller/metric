/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package metric;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MetricTest {
    private static void testMethod() {
        for (int i = 0; i < 100000; i++) {
            int y = i - 1;
            i = i + y - y;
        }
    }

    @Test
    public void elapsedMillisReturnsSomething() {
        assertTrue(Metric.elapsedMillis(MetricTest::testMethod) > 0);
    }
}
