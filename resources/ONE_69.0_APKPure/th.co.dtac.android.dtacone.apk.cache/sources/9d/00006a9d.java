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
    public static long f34048a;

    /* renamed from: b */
    public static Method f34049b;

    /* renamed from: c */
    public static Method f34050c;

    /* renamed from: d */
    public static Method f34051d;

    /* renamed from: e */
    public static Method f34052e;

    /* renamed from: androidx.core.os.TraceCompat$a */
    /* loaded from: classes2.dex */
    public static class C4032a {
        @DoNotInline
        /* renamed from: a */
        public static void m57113a(String str) {
            Trace.beginSection(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57112b() {
            Trace.endSection();
        }
    }

    /* renamed from: androidx.core.os.TraceCompat$b */
    /* loaded from: classes2.dex */
    public static class C4033b {
        @DoNotInline
        /* renamed from: a */
        public static void m57111a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57110b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57109c() {
            return Trace.isEnabled();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57108d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f34048a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f34049b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f34050c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f34051d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f34052e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void beginAsyncSection(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4033b.m57111a(str, i);
            return;
        }
        try {
            f34050c.invoke(null, Long.valueOf(f34048a), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void beginSection(@NonNull String str) {
        C4032a.m57113a(str);
    }

    public static void endAsyncSection(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4033b.m57110b(str, i);
            return;
        }
        try {
            f34051d.invoke(null, Long.valueOf(f34048a), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void endSection() {
        C4032a.m57112b();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4033b.m57109c();
        }
        try {
            return ((Boolean) f34049b.invoke(null, Long.valueOf(f34048a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setCounter(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4033b.m57108d(str, i);
            return;
        }
        try {
            f34052e.invoke(null, Long.valueOf(f34048a), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}