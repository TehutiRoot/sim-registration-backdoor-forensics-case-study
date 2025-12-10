package androidx.tracing;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class Trace {

    /* renamed from: a */
    public static long f37614a;

    /* renamed from: b */
    public static Method f37615b;

    /* renamed from: c */
    public static Method f37616c;

    /* renamed from: d */
    public static Method f37617d;

    /* renamed from: e */
    public static Method f37618e;

    /* renamed from: a */
    public static void m52721a(String str, int i) {
        try {
            if (f37616c == null) {
                f37616c = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f37616c.invoke(null, Long.valueOf(f37614a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m52719c("asyncTraceBegin", e);
        }
    }

    /* renamed from: b */
    public static void m52720b(String str, int i) {
        try {
            if (f37617d == null) {
                f37617d = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f37617d.invoke(null, Long.valueOf(f37614a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m52719c("asyncTraceEnd", e);
        }
    }

    @SuppressLint({"NewApi"})
    public static void beginAsyncSection(@NonNull String str, int i) {
        try {
            if (f37616c == null) {
                HU1.m68085a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m52721a(str, i);
    }

    public static void beginSection(@NonNull String str) {
        GU1.m68235a(str);
    }

    /* renamed from: c */
    public static void m52719c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    /* renamed from: d */
    public static boolean m52718d() {
        try {
            if (f37615b == null) {
                f37614a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f37615b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f37615b.invoke(null, Long.valueOf(f37614a))).booleanValue();
        } catch (Exception e) {
            m52719c("isTagEnabled", e);
            return false;
        }
    }

    /* renamed from: e */
    public static void m52717e(String str, int i) {
        try {
            if (f37618e == null) {
                f37618e = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f37618e.invoke(null, Long.valueOf(f37614a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m52719c("traceCounter", e);
        }
    }

    @SuppressLint({"NewApi"})
    public static void endAsyncSection(@NonNull String str, int i) {
        try {
            if (f37617d == null) {
                HU1.m68084b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m52720b(str, i);
    }

    public static void endSection() {
        GU1.m68234b();
    }

    @SuppressLint({"NewApi"})
    public static boolean isEnabled() {
        boolean isEnabled;
        try {
            if (f37615b == null) {
                isEnabled = android.os.Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m52718d();
    }

    @SuppressLint({"NewApi"})
    public static void setCounter(@NonNull String str, int i) {
        try {
            if (f37618e == null) {
                HU1.m68083c(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m52717e(str, i);
    }
}
