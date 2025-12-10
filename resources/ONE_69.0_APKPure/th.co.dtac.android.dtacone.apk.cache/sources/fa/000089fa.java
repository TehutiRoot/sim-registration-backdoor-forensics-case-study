package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

/* loaded from: classes3.dex */
public final class Logging {
    /* renamed from: a */
    public static String m49116a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    public static String m49115b(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m49116a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: d */
    public static void m49114d(String str, String str2) {
        Log.isLoggable(m49115b(str), 3);
    }

    /* renamed from: e */
    public static void m49110e(String str, String str2, Throwable th2) {
        Log.isLoggable(m49115b(str), 6);
    }

    /* renamed from: i */
    public static void m49109i(String str, String str2, Object obj) {
        if (Log.isLoggable(m49115b(str), 4)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: w */
    public static void m49108w(String str, String str2, Object obj) {
        String m49115b = m49115b(str);
        if (Log.isLoggable(m49115b, 5)) {
            Log.w(m49115b, String.format(str2, obj));
        }
    }

    /* renamed from: d */
    public static void m49113d(String str, String str2, Object obj) {
        if (Log.isLoggable(m49115b(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: d */
    public static void m49112d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(m49115b(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    /* renamed from: d */
    public static void m49111d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m49115b(str), 3)) {
            String.format(str2, objArr);
        }
    }
}