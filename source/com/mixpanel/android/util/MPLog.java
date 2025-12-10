package com.mixpanel.android.util;

import android.util.Log;

/* loaded from: classes5.dex */
public class MPLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    /* renamed from: a */
    public static int f58759a = 5;

    /* renamed from: a */
    public static boolean m33460a(int i) {
        if (f58759a <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m33459d(String str, String str2) {
        m33460a(3);
    }

    /* renamed from: e */
    public static void m33457e(String str, String str2) {
        m33460a(6);
    }

    /* renamed from: i */
    public static void m33455i(String str, String str2) {
        m33460a(4);
    }

    public static void setLevel(int i) {
        f58759a = i;
    }

    /* renamed from: v */
    public static void m33453v(String str, String str2) {
        m33460a(2);
    }

    /* renamed from: w */
    public static void m33451w(String str, String str2) {
        if (m33460a(5)) {
            Log.w(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        m33460a(6);
    }

    /* renamed from: d */
    public static void m33458d(String str, String str2, Throwable th2) {
        m33460a(3);
    }

    /* renamed from: e */
    public static void m33456e(String str, String str2, Throwable th2) {
        m33460a(6);
    }

    /* renamed from: i */
    public static void m33454i(String str, String str2, Throwable th2) {
        m33460a(4);
    }

    /* renamed from: v */
    public static void m33452v(String str, String str2, Throwable th2) {
        m33460a(2);
    }

    public static void wtf(String str, String str2, Throwable th2) {
        m33460a(6);
    }

    /* renamed from: w */
    public static void m33450w(String str, String str2, Throwable th2) {
        if (m33460a(5)) {
            Log.w(str, str2, th2);
        }
    }
}
