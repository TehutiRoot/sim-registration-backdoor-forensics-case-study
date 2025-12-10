package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vm */
/* loaded from: classes2.dex */
public abstract class AbstractC16930vm {
    /* renamed from: a */
    public static int[] m851a(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: b */
    public static final int m850b(int[] iArr, int i) {
        return iArr[i + m849c(iArr)];
    }

    /* renamed from: c */
    public static final int m849c(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: d */
    public static final void m848d(int[] iArr, int i, int i2) {
        iArr[i + m849c(iArr)] = i2;
    }
}