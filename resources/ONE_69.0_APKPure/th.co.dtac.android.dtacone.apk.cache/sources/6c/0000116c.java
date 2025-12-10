package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: SK1 */
/* loaded from: classes2.dex */
public abstract class SK1 {
    /* renamed from: a */
    public static final void m66522a(int[] iArr, C21855qf0 diagonals) {
        Intrinsics.checkNotNullParameter(diagonals, "diagonals");
        if (m66517f(iArr)) {
            if (m66516g(iArr)) {
                diagonals.m23613g(m66515h(iArr), m66514i(iArr), m66520c(iArr));
                return;
            } else if (m66513j(iArr)) {
                diagonals.m23613g(m66515h(iArr), m66514i(iArr) + 1, m66520c(iArr));
                return;
            } else {
                diagonals.m23613g(m66515h(iArr) + 1, m66514i(iArr), m66520c(iArr));
                return;
            }
        }
        diagonals.m23613g(m66515h(iArr), m66514i(iArr), m66519d(iArr) - m66515h(iArr));
    }

    /* renamed from: b */
    public static int[] m66521b(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: c */
    public static final int m66520c(int[] iArr) {
        return Math.min(m66519d(iArr) - m66515h(iArr), m66518e(iArr) - m66514i(iArr));
    }

    /* renamed from: d */
    public static final int m66519d(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: e */
    public static final int m66518e(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: f */
    public static final boolean m66517f(int[] iArr) {
        if (m66518e(iArr) - m66514i(iArr) != m66519d(iArr) - m66515h(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m66516g(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final int m66515h(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: i */
    public static final int m66514i(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: j */
    public static final boolean m66513j(int[] iArr) {
        if (m66518e(iArr) - m66514i(iArr) > m66519d(iArr) - m66515h(iArr)) {
            return true;
        }
        return false;
    }
}