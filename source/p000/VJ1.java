package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: VJ1 */
/* loaded from: classes2.dex */
public abstract class VJ1 {
    /* renamed from: a */
    public static final void m65873a(int[] iArr, C20760kf0 diagonals) {
        Intrinsics.checkNotNullParameter(diagonals, "diagonals");
        if (m65868f(iArr)) {
            if (m65867g(iArr)) {
                diagonals.m28895g(m65866h(iArr), m65865i(iArr), m65871c(iArr));
                return;
            } else if (m65864j(iArr)) {
                diagonals.m28895g(m65866h(iArr), m65865i(iArr) + 1, m65871c(iArr));
                return;
            } else {
                diagonals.m28895g(m65866h(iArr) + 1, m65865i(iArr), m65871c(iArr));
                return;
            }
        }
        diagonals.m28895g(m65866h(iArr), m65865i(iArr), m65870d(iArr) - m65866h(iArr));
    }

    /* renamed from: b */
    public static int[] m65872b(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: c */
    public static final int m65871c(int[] iArr) {
        return Math.min(m65870d(iArr) - m65866h(iArr), m65869e(iArr) - m65865i(iArr));
    }

    /* renamed from: d */
    public static final int m65870d(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: e */
    public static final int m65869e(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: f */
    public static final boolean m65868f(int[] iArr) {
        if (m65869e(iArr) - m65865i(iArr) != m65870d(iArr) - m65866h(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m65867g(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final int m65866h(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: i */
    public static final int m65865i(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: j */
    public static final boolean m65864j(int[] iArr) {
        if (m65869e(iArr) - m65865i(iArr) > m65870d(iArr) - m65866h(iArr)) {
            return true;
        }
        return false;
    }
}
