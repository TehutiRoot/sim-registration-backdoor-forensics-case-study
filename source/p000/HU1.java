package p000;

import android.os.Trace;

/* renamed from: HU1 */
/* loaded from: classes2.dex */
public abstract class HU1 {
    /* renamed from: a */
    public static void m68085a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* renamed from: b */
    public static void m68084b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: c */
    public static void m68083c(String str, int i) {
        Trace.setCounter(str, i);
    }
}
