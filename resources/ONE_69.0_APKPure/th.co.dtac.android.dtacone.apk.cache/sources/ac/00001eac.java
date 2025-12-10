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
    public static int f10933a = 3;

    /* renamed from: a */
    public static boolean m63181a(String str, int i) {
        if (f10933a > i && !Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m63180b() {
        f10933a = 3;
    }

    /* renamed from: c */
    public static void m63179c(int i) {
        f10933a = i;
    }

    /* renamed from: d */
    public static void m63178d(@NonNull String str, @NonNull String str2) {
        m63181a(m63174f(str), 3);
    }

    /* renamed from: e */
    public static void m63176e(@NonNull String str, @NonNull String str2) {
        m63181a(m63174f(str), 6);
    }

    /* renamed from: f */
    public static String m63174f(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    /* renamed from: i */
    public static void m63173i(@NonNull String str, @NonNull String str2) {
        m63181a(m63174f(str), 4);
    }

    public static boolean isDebugEnabled(@NonNull String str) {
        return m63181a(m63174f(str), 3);
    }

    public static boolean isErrorEnabled(@NonNull String str) {
        return m63181a(m63174f(str), 6);
    }

    public static boolean isInfoEnabled(@NonNull String str) {
        return m63181a(m63174f(str), 4);
    }

    public static boolean isWarnEnabled(@NonNull String str) {
        return m63181a(m63174f(str), 5);
    }

    /* renamed from: w */
    public static void m63171w(@NonNull String str, @NonNull String str2) {
        String m63174f = m63174f(str);
        if (m63181a(m63174f, 5)) {
            Log.w(m63174f, str2);
        }
    }

    /* renamed from: d */
    public static void m63177d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        m63181a(m63174f(str), 3);
    }

    /* renamed from: e */
    public static void m63175e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        m63181a(m63174f(str), 6);
    }

    /* renamed from: i */
    public static void m63172i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        m63181a(m63174f(str), 4);
    }

    /* renamed from: w */
    public static void m63170w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String m63174f = m63174f(str);
        if (m63181a(m63174f, 5)) {
            Log.w(m63174f, str2, th2);
        }
    }
}