package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes4.dex */
public class Logger {
    public static final String TAG = "FirebaseCrashlytics";

    /* renamed from: c */
    public static final Logger f54774c = new Logger(TAG);

    /* renamed from: a */
    public final String f54775a;

    /* renamed from: b */
    public int f54776b = 4;

    public Logger(String str) {
        this.f54775a = str;
    }

    public static Logger getLogger() {
        return f54774c;
    }

    /* renamed from: a */
    public final boolean m39133a(int i) {
        if (this.f54776b > i && !Log.isLoggable(this.f54775a, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m39131d(String str, Throwable th2) {
        m39133a(3);
    }

    /* renamed from: e */
    public void m39129e(String str, Throwable th2) {
        m39133a(6);
    }

    /* renamed from: i */
    public void m39127i(String str, Throwable th2) {
        m39133a(4);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* renamed from: v */
    public void m39125v(String str, Throwable th2) {
        m39133a(2);
    }

    /* renamed from: w */
    public void m39123w(String str, Throwable th2) {
        if (m39133a(5)) {
            Log.w(this.f54775a, str, th2);
        }
    }

    /* renamed from: d */
    public void m39132d(String str) {
        m39131d(str, null);
    }

    /* renamed from: e */
    public void m39130e(String str) {
        m39129e(str, null);
    }

    /* renamed from: i */
    public void m39128i(String str) {
        m39127i(str, null);
    }

    public void log(int i, String str, boolean z) {
        if (z || m39133a(i)) {
            Log.println(i, this.f54775a, str);
        }
    }

    /* renamed from: v */
    public void m39126v(String str) {
        m39125v(str, null);
    }

    /* renamed from: w */
    public void m39124w(String str) {
        m39123w(str, null);
    }
}