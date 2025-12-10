package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes4.dex */
public class Logger {
    public static final String TAG = "FirebaseCrashlytics";

    /* renamed from: c */
    public static final Logger f54762c = new Logger(TAG);

    /* renamed from: a */
    public final String f54763a;

    /* renamed from: b */
    public int f54764b = 4;

    public Logger(String str) {
        this.f54763a = str;
    }

    public static Logger getLogger() {
        return f54762c;
    }

    /* renamed from: a */
    public final boolean m39141a(int i) {
        if (this.f54764b > i && !Log.isLoggable(this.f54763a, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m39139d(String str, Throwable th2) {
        m39141a(3);
    }

    /* renamed from: e */
    public void m39137e(String str, Throwable th2) {
        m39141a(6);
    }

    /* renamed from: i */
    public void m39135i(String str, Throwable th2) {
        m39141a(4);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* renamed from: v */
    public void m39133v(String str, Throwable th2) {
        m39141a(2);
    }

    /* renamed from: w */
    public void m39131w(String str, Throwable th2) {
        if (m39141a(5)) {
            Log.w(this.f54763a, str, th2);
        }
    }

    /* renamed from: d */
    public void m39140d(String str) {
        m39139d(str, null);
    }

    /* renamed from: e */
    public void m39138e(String str) {
        m39137e(str, null);
    }

    /* renamed from: i */
    public void m39136i(String str) {
        m39135i(str, null);
    }

    public void log(int i, String str, boolean z) {
        if (z || m39141a(i)) {
            Log.println(i, this.f54763a, str);
        }
    }

    /* renamed from: v */
    public void m39134v(String str) {
        m39133v(str, null);
    }

    /* renamed from: w */
    public void m39132w(String str) {
        m39131w(str, null);
    }
}
