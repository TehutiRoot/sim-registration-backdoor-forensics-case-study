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
    public static int f58771a = 5;

    /* renamed from: a */
    public static boolean m33452a(int i) {
        if (f58771a <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m33451d(String str, String str2) {
        m33452a(3);
    }

    /* renamed from: e */
    public static void m33449e(String str, String str2) {
        m33452a(6);
    }

    /* renamed from: i */
    public static void m33447i(String str, String str2) {
        m33452a(4);
    }

    public static void setLevel(int i) {
        f58771a = i;
    }

    /* renamed from: v */
    public static void m33445v(String str, String str2) {
        m33452a(2);
    }

    /* renamed from: w */
    public static void m33443w(String str, String str2) {
        if (m33452a(5)) {
            Log.w(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        m33452a(6);
    }

    /* renamed from: d */
    public static void m33450d(String str, String str2, Throwable th2) {
        m33452a(3);
    }

    /* renamed from: e */
    public static void m33448e(String str, String str2, Throwable th2) {
        m33452a(6);
    }

    /* renamed from: i */
    public static void m33446i(String str, String str2, Throwable th2) {
        m33452a(4);
    }

    /* renamed from: v */
    public static void m33444v(String str, String str2, Throwable th2) {
        m33452a(2);
    }

    public static void wtf(String str, String str2, Throwable th2) {
        m33452a(6);
    }

    /* renamed from: w */
    public static void m33442w(String str, String str2, Throwable th2) {
        if (m33452a(5)) {
            Log.w(str, str2, th2);
        }
    }
}