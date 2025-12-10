package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vm */
/* loaded from: classes2.dex */
public abstract class AbstractC16916vm {
    /* renamed from: a */
    public static int[] m1005a(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: b */
    public static final int m1004b(int[] iArr, int i) {
        return iArr[i + m1003c(iArr)];
    }

    /* renamed from: c */
    public static final int m1003c(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: d */
    public static final void m1002d(int[] iArr, int i, int i2) {
        iArr[i + m1003c(iArr)] = i2;
    }
}
