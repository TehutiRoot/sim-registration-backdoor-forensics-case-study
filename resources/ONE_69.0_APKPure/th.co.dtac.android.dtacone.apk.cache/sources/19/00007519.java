package androidx.tracing;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class Trace {

    /* renamed from: a */
    public static long f37702a;

    /* renamed from: b */
    public static Method f37703b;

    /* renamed from: c */
    public static Method f37704c;

    /* renamed from: d */
    public static Method f37705d;

    /* renamed from: e */
    public static Method f37706e;

    /* renamed from: a */
    public static void m52672a(String str, int i) {
        try {
            if (f37704c == null) {
                f37704c = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f37704c.invoke(null, Long.valueOf(f37702a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m52670c("asyncTraceBegin", e);
        }
    }

    /* renamed from: b */
    public static void m52671b(String str, int i) {
        try {
            if (f37705d == null) {
                f37705d = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f37705d.invoke(null, Long.valueOf(f37702a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m52670c("asyncTraceEnd", e);
        }
    }

    @SuppressLint({"NewApi"})
    public static void beginAsyncSection(@NonNull String str, int i) {
        try {
            if (f37704c == null) {
                EV1.m68639a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m52672a(str, i);
    }

    public static void beginSection(@NonNull String str) {
        DV1.m68824a(str);
    }

    /* renamed from: c */
    public static void m52670c(String str, Exception exc) {
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
    public static boolean m52669d() {
        try {
            if (f37703b == null) {
                f37702a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f37703b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f37703b.invoke(null, Long.valueOf(f37702a))).booleanValue();
        } catch (Exception e) {
            m52670c("isTagEnabled", e);
            return false;
        }
    }

    /* renamed from: e */
    public static void m52668e(String str, int i) {
        try {
            if (f37706e == null) {
                f37706e = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f37706e.invoke(null, Long.valueOf(f37702a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m52670c("traceCounter", e);
        }
    }

    @SuppressLint({"NewApi"})
    public static void endAsyncSection(@NonNull String str, int i) {
        try {
            if (f37705d == null) {
                EV1.m68638b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m52671b(str, i);
    }

    public static void endSection() {
        DV1.m68823b();
    }

    @SuppressLint({"NewApi"})
    public static boolean isEnabled() {
        boolean isEnabled;
        try {
            if (f37703b == null) {
                isEnabled = android.os.Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m52669d();
    }

    @SuppressLint({"NewApi"})
    public static void setCounter(@NonNull String str, int i) {
        try {
            if (f37706e == null) {
                EV1.m68637c(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m52668e(str, i);
    }
}