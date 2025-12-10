package androidx.camera.core;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Logger {

    /* renamed from: a */
    public static int f10845a = 3;

    /* renamed from: a */
    public static boolean m63233a(String str, int i) {
        if (f10845a > i && !Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m63232b() {
        f10845a = 3;
    }

    /* renamed from: c */
    public static void m63231c(int i) {
        f10845a = i;
    }

    /* renamed from: d */
    public static void m63230d(@NonNull String str, @NonNull String str2) {
        m63233a(m63226f(str), 3);
    }

    /* renamed from: e */
    public static void m63228e(@NonNull String str, @NonNull String str2) {
        m63233a(m63226f(str), 6);
    }

    /* renamed from: f */
    public static String m63226f(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    /* renamed from: i */
    public static void m63225i(@NonNull String str, @NonNull String str2) {
        m63233a(m63226f(str), 4);
    }

    public static boolean isDebugEnabled(@NonNull String str) {
        return m63233a(m63226f(str), 3);
    }

    public static boolean isErrorEnabled(@NonNull String str) {
        return m63233a(m63226f(str), 6);
    }

    public static boolean isInfoEnabled(@NonNull String str) {
        return m63233a(m63226f(str), 4);
    }

    public static boolean isWarnEnabled(@NonNull String str) {
        return m63233a(m63226f(str), 5);
    }

    /* renamed from: w */
    public static void m63223w(@NonNull String str, @NonNull String str2) {
        String m63226f = m63226f(str);
        if (m63233a(m63226f, 5)) {
            Log.w(m63226f, str2);
        }
    }

    /* renamed from: d */
    public static void m63229d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        m63233a(m63226f(str), 3);
    }

    /* renamed from: e */
    public static void m63227e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        m63233a(m63226f(str), 6);
    }

    /* renamed from: i */
    public static void m63224i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        m63233a(m63226f(str), 4);
    }

    /* renamed from: w */
    public static void m63222w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String m63226f = m63226f(str);
        if (m63233a(m63226f, 5)) {
            Log.w(m63226f, str2, th2);
        }
    }
}
