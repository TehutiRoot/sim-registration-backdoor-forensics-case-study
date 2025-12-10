package p000;

import android.os.Trace;

/* renamed from: EV1 */
/* loaded from: classes2.dex */
public abstract class EV1 {
    /* renamed from: a */
    public static void m68639a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* renamed from: b */
    public static void m68638b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: c */
    public static void m68637c(String str, int i) {
        Trace.setCounter(str, i);
    }
}