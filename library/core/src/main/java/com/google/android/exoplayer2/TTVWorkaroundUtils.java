package com.google.android.exoplayer2;

/**
 * Created by Peter on 12/11/2017.
 */

public class TTVWorkaroundUtils {
    private static boolean enableAllWorkaround = false;
    private static final Object lock = new Object();

    public static void enableAllWorkaround() {
        synchronized (lock) {
            enableAllWorkaround = true;
        }
    }

    public static void disableAllWorkaround() {
        synchronized (lock) {
            enableAllWorkaround = false;
        }
    }

    public static boolean isAllWorkaroundEnabled() {
        synchronized (lock) {
            return enableAllWorkaround;
        }
    }
}