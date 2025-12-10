package com.facebook.stetho.common;

import java.util.Locale;

/* loaded from: classes3.dex */
public class LogUtil {
    private static final String TAG = "stetho";

    /* renamed from: d */
    public static void m49806d(String str, Object... objArr) {
        m49807d(format(str, objArr));
    }

    /* renamed from: e */
    public static void m49802e(String str, Object... objArr) {
        m49803e(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i */
    public static void m49798i(String str, Object... objArr) {
        m49799i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i != 5 && i != 6) {
            return LogRedirector.isLoggable(TAG, i);
        }
        return true;
    }

    /* renamed from: v */
    public static void m49794v(String str, Object... objArr) {
        m49795v(format(str, objArr));
    }

    /* renamed from: w */
    public static void m49790w(String str, Object... objArr) {
        m49791w(format(str, objArr));
    }

    /* renamed from: d */
    public static void m49804d(Throwable th2, String str, Object... objArr) {
        m49805d(th2, format(str, objArr));
    }

    /* renamed from: e */
    public static void m49800e(Throwable th2, String str, Object... objArr) {
        m49801e(th2, format(str, objArr));
    }

    /* renamed from: i */
    public static void m49796i(Throwable th2, String str, Object... objArr) {
        m49797i(th2, format(str, objArr));
    }

    /* renamed from: v */
    public static void m49792v(Throwable th2, String str, Object... objArr) {
        m49793v(th2, format(str, objArr));
    }

    /* renamed from: w */
    public static void m49788w(Throwable th2, String str, Object... objArr) {
        m49789w(th2, format(str, objArr));
    }

    /* renamed from: d */
    public static void m49807d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m49817d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m49803e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m49815e(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m49799i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m49813i(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m49795v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m49811v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m49791w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m49809w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m49805d(Throwable th2, String str) {
        if (isLoggable(3)) {
            LogRedirector.m49816d(TAG, str, th2);
        }
    }

    /* renamed from: e */
    public static void m49801e(Throwable th2, String str) {
        if (isLoggable(6)) {
            LogRedirector.m49814e(TAG, str, th2);
        }
    }

    /* renamed from: i */
    public static void m49797i(Throwable th2, String str) {
        if (isLoggable(4)) {
            LogRedirector.m49812i(TAG, str, th2);
        }
    }

    /* renamed from: v */
    public static void m49793v(Throwable th2, String str) {
        if (isLoggable(2)) {
            LogRedirector.m49810v(TAG, str, th2);
        }
    }

    /* renamed from: w */
    public static void m49789w(Throwable th2, String str) {
        if (isLoggable(5)) {
            LogRedirector.m49808w(TAG, str, th2);
        }
    }
}
