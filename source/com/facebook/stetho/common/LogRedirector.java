package com.facebook.stetho.common;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class LogRedirector {
    private static volatile Logger sLogger;

    /* loaded from: classes3.dex */
    public interface Logger {
        boolean isLoggable(String str, int i);

        void log(int i, String str, String str2);
    }

    /* renamed from: d */
    public static void m49816d(String str, String str2, Throwable th2) {
        m49817d(str, str2 + "\n" + formatThrowable(th2));
    }

    /* renamed from: e */
    public static void m49814e(String str, String str2, Throwable th2) {
        m49815e(str, str2 + "\n" + formatThrowable(th2));
    }

    private static String formatThrowable(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m49812i(String str, String str2, Throwable th2) {
        m49813i(str, str2 + "\n" + formatThrowable(th2));
    }

    public static boolean isLoggable(String str, int i) {
        Logger logger = sLogger;
        if (logger != null) {
            return logger.isLoggable(str, i);
        }
        return Log.isLoggable(str, i);
    }

    private static void log(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.log(i, str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        Util.throwIfNull(logger);
        Util.throwIfNotNull(sLogger);
        sLogger = logger;
    }

    /* renamed from: v */
    public static void m49810v(String str, String str2, Throwable th2) {
        m49811v(str, str2 + "\n" + formatThrowable(th2));
    }

    /* renamed from: w */
    public static void m49808w(String str, String str2, Throwable th2) {
        m49809w(str, str2 + "\n" + formatThrowable(th2));
    }

    /* renamed from: d */
    public static void m49817d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m49815e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m49813i(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: v */
    public static void m49811v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m49809w(String str, String str2) {
        log(5, str, str2);
    }
}
