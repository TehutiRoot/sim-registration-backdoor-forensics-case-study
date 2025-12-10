package io.realm.log;

import android.util.Log;
import java.util.Locale;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class RealmLog {

    /* renamed from: a */
    public static String f66909a = "REALM_JAVA";

    /* renamed from: a */
    public static void m29389a(int i, Throwable th2, String str, Object... objArr) {
        if (i < getLevel()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th2 != null) {
            sb.append(Log.getStackTraceString(th2));
        }
        if (str != null) {
            if (th2 != null) {
                sb.append("\n");
            }
            sb.append(str);
        }
        nativeLog(i, f66909a, th2, sb.toString());
    }

    public static void add(RealmLogger realmLogger) {
        if (realmLogger != null) {
            nativeAddLogger(realmLogger);
            return;
        }
        throw new IllegalArgumentException("A non-null logger has to be provided");
    }

    public static void clear() {
        nativeClearLoggers();
    }

    public static void debug(@Nullable Throwable th2) {
        debug(th2, null, new Object[0]);
    }

    public static void error(Throwable th2) {
        error(th2, null, new Object[0]);
    }

    public static void fatal(Throwable th2) {
        fatal(th2, null, new Object[0]);
    }

    public static int getLevel() {
        return nativeGetLogLevel();
    }

    public static void info(Throwable th2) {
        info(th2, null, new Object[0]);
    }

    private static native void nativeAddLogger(RealmLogger realmLogger);

    private static native void nativeClearLoggers();

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i, String str, @Nullable Throwable th2, @Nullable String str2);

    private static native void nativeRegisterDefaultLogger();

    private static native void nativeRemoveLogger(RealmLogger realmLogger);

    private static native void nativeSetLogLevel(int i);

    public static void registerDefaultLogger() {
        nativeRegisterDefaultLogger();
    }

    public static boolean remove(RealmLogger realmLogger) {
        if (realmLogger != null) {
            nativeRemoveLogger(realmLogger);
            return true;
        }
        throw new IllegalArgumentException("A non-null logger has to be provided");
    }

    public static void setLevel(int i) {
        if (i >= 1 && i <= 8) {
            nativeSetLogLevel(i);
            return;
        }
        throw new IllegalArgumentException("Invalid log level: " + i);
    }

    public static void trace(Throwable th2) {
        trace(th2, null, new Object[0]);
    }

    public static void warn(Throwable th2) {
        warn(th2, null, new Object[0]);
    }

    public static void debug(String str, Object... objArr) {
        debug(null, str, objArr);
    }

    public static void error(String str, Object... objArr) {
        error(null, str, objArr);
    }

    public static void fatal(String str, Object... objArr) {
        fatal(null, str, objArr);
    }

    public static void info(String str, Object... objArr) {
        info(null, str, objArr);
    }

    public static void trace(String str, Object... objArr) {
        trace(null, str, objArr);
    }

    public static void warn(String str, Object... objArr) {
        warn(null, str, objArr);
    }

    public static void debug(@Nullable Throwable th2, @Nullable String str, Object... objArr) {
        m29389a(3, th2, str, objArr);
    }

    public static void error(@Nullable Throwable th2, @Nullable String str, Object... objArr) {
        m29389a(6, th2, str, objArr);
    }

    public static void fatal(@Nullable Throwable th2, @Nullable String str, Object... objArr) {
        m29389a(7, th2, str, objArr);
    }

    public static void info(@Nullable Throwable th2, @Nullable String str, Object... objArr) {
        m29389a(4, th2, str, objArr);
    }

    public static void trace(@Nullable Throwable th2, @Nullable String str, Object... objArr) {
        m29389a(2, th2, str, objArr);
    }

    public static void warn(@Nullable Throwable th2, @Nullable String str, Object... objArr) {
        m29389a(5, th2, str, objArr);
    }
}
