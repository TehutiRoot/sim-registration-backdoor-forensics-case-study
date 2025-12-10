package androidx.core.p005os;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.TraceCompat */
/* loaded from: classes2.dex */
public final class TraceCompat {

    /* renamed from: a */
    public static long f33960a;

    /* renamed from: b */
    public static Method f33961b;

    /* renamed from: c */
    public static Method f33962c;

    /* renamed from: d */
    public static Method f33963d;

    /* renamed from: e */
    public static Method f33964e;

    /* renamed from: androidx.core.os.TraceCompat$a */
    /* loaded from: classes2.dex */
    public static class C4050a {
        @DoNotInline
        /* renamed from: a */
        public static void m57163a(String str) {
            Trace.beginSection(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57162b() {
            Trace.endSection();
        }
    }

    /* renamed from: androidx.core.os.TraceCompat$b */
    /* loaded from: classes2.dex */
    public static class C4051b {
        @DoNotInline
        /* renamed from: a */
        public static void m57161a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57160b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57159c() {
            return Trace.isEnabled();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57158d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f33960a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f33961b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f33962c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f33963d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f33964e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void beginAsyncSection(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4051b.m57161a(str, i);
            return;
        }
        try {
            f33962c.invoke(null, Long.valueOf(f33960a), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void beginSection(@NonNull String str) {
        C4050a.m57163a(str);
    }

    public static void endAsyncSection(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4051b.m57160b(str, i);
            return;
        }
        try {
            f33963d.invoke(null, Long.valueOf(f33960a), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void endSection() {
        C4050a.m57162b();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4051b.m57159c();
        }
        try {
            return ((Boolean) f33961b.invoke(null, Long.valueOf(f33960a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setCounter(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4051b.m57158d(str, i);
            return;
        }
        try {
            f33964e.invoke(null, Long.valueOf(f33960a), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}
