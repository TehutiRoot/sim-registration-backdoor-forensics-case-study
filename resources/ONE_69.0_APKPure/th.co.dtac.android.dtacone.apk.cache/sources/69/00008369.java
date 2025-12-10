package com.facebook.stetho.common;

import java.util.Locale;

/* loaded from: classes3.dex */
public class LogUtil {
    private static final String TAG = "stetho";

    /* renamed from: d */
    public static void m49803d(String str, Object... objArr) {
        m49804d(format(str, objArr));
    }

    /* renamed from: e */
    public static void m49799e(String str, Object... objArr) {
        m49800e(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i */
    public static void m49795i(String str, Object... objArr) {
        m49796i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i != 5 && i != 6) {
            return LogRedirector.isLoggable(TAG, i);
        }
        return true;
    }

    /* renamed from: v */
    public static void m49791v(String str, Object... objArr) {
        m49792v(format(str, objArr));
    }

    /* renamed from: w */
    public static void m49787w(String str, Object... objArr) {
        m49788w(format(str, objArr));
    }

    /* renamed from: d */
    public static void m49801d(Throwable th2, String str, Object... objArr) {
        m49802d(th2, format(str, objArr));
    }

    /* renamed from: e */
    public static void m49797e(Throwable th2, String str, Object... objArr) {
        m49798e(th2, format(str, objArr));
    }

    /* renamed from: i */
    public static void m49793i(Throwable th2, String str, Object... objArr) {
        m49794i(th2, format(str, objArr));
    }

    /* renamed from: v */
    public static void m49789v(Throwable th2, String str, Object... objArr) {
        m49790v(th2, format(str, objArr));
    }

    /* renamed from: w */
    public static void m49785w(Throwable th2, String str, Object... objArr) {
        m49786w(th2, format(str, objArr));
    }

    /* renamed from: d */
    public static void m49804d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m49814d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m49800e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m49812e(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m49796i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m49810i(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m49792v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m49808v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m49788w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m49806w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m49802d(Throwable th2, String str) {
        if (isLoggable(3)) {
            LogRedirector.m49813d(TAG, str, th2);
        }
    }

    /* renamed from: e */
    public static void m49798e(Throwable th2, String str) {
        if (isLoggable(6)) {
            LogRedirector.m49811e(TAG, str, th2);
        }
    }

    /* renamed from: i */
    public static void m49794i(Throwable th2, String str) {
        if (isLoggable(4)) {
            LogRedirector.m49809i(TAG, str, th2);
        }
    }

    /* renamed from: v */
    public static void m49790v(Throwable th2, String str) {
        if (isLoggable(2)) {
            LogRedirector.m49807v(TAG, str, th2);
        }
    }

    /* renamed from: w */
    public static void m49786w(Throwable th2, String str) {
        if (isLoggable(5)) {
            LogRedirector.m49805w(TAG, str, th2);
        }
    }
}