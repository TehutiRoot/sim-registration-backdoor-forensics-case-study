package com.airbnb.lottie.utils;

import com.airbnb.lottie.LottieLogger;

/* loaded from: classes3.dex */
public class Logger {

    /* renamed from: a */
    public static LottieLogger f41599a = new LogcatLogger();

    public static void debug(String str) {
        f41599a.debug(str);
    }

    public static void error(String str, Throwable th2) {
        f41599a.error(str, th2);
    }

    public static void setInstance(LottieLogger lottieLogger) {
        f41599a = lottieLogger;
    }

    public static void warning(String str) {
        f41599a.warning(str);
    }

    public static void debug(String str, Throwable th2) {
        f41599a.debug(str, th2);
    }

    public static void warning(String str, Throwable th2) {
        f41599a.warning(str, th2);
    }
}
