package org.hillel.hometask4;

public class Railway {
    public static boolean colisProbability(boolean result1, boolean result2) {
        double T1, T2;
        int V1, V2;
        V1 = 100;
        V2 = 110;
        T1 = 4 / V1;
        T2 = 6 / V2;
        if (T1<T2) {
            System.out.println("Trains no collide");

        }
        else {
            System.out.println("Trains collide");

        }
        return result1;

    }
}
