package org.boris.xlloop;

import org.boris.xlloop.util.XLMap;
import org.boris.xlloop.xloper.XLoper;

public class Test
{
    public static Object[][] toArray(String name) {
        Object[][] val = { { name, "Hello" }, { "This", "Row" } };
        return val;
    }

    public static Object[][] toArray(String name, boolean other) {
        Object[][] val = { { name, new Boolean(other) },
                { "Method", "Overload" } };
        return val;
    }

    public static double sumV(double[] things) {
        double res = 0;
        for (int i = 0; i < things.length; i++) {
            res += things[i];
        }
        return res;
    }

    public static double sumM(double[][] things) {
        double res = 0;
        for (int i = 0; i < things.length; i++) {
            for (int j = 0; j < things[i].length; j++) {
                res += things[i][j];
            }
        }
        return res;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double echo(double v) {
        return v;
    }

    public static XLoper mapTest() {
        XLMap s = new XLMap();
        s.add("test", 2);
        s.add("hello", 3);
        return s.toXloper();
    }
}
