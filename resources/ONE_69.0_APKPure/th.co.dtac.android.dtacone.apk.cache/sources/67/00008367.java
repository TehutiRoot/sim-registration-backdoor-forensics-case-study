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
    public static void m49813d(String str, String str2, Throwable th2) {
        m49814d(str, str2 + "\n" + formatThrowable(th2));
    }

    /* renamed from: e */
    public static void m49811e(String str, String str2, Throwable th2) {
        m49812e(str, str2 + "\n" + formatThrowable(th2));
    }

    private static String formatThrowable(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m49809i(String str, String str2, Throwable th2) {
        m49810i(str, str2 + "\n" + formatThrowable(th2));
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
    public static void m49807v(String str, String str2, Throwable th2) {
        m49808v(str, str2 + "\n" + formatThrowable(th2));
    }

    /* renamed from: w */
    public static void m49805w(String str, String str2, Throwable th2) {
        m49806w(str, str2 + "\n" + formatThrowable(th2));
    }

    /* renamed from: d */
    public static void m49814d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m49812e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m49810i(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: v */
    public static void m49808v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m49806w(String str, String str2) {
        log(5, str, str2);
    }
}