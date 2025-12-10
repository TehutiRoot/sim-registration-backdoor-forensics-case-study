package p000;

import androidx.compose.p003ui.node.MyersDiffKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kf0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20760kf0 {

    /* renamed from: a */
    public int[] f67969a;

    /* renamed from: b */
    public int f67970b;

    public C20760kf0(int i) {
        this.f67969a = new int[i];
    }

    /* renamed from: a */
    public final boolean m28901a(int i, int i2) {
        int[] iArr = this.f67969a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 < i4) {
            return true;
        }
        if (i3 == i4 && iArr[i + 1] <= iArr[i2 + 1]) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m28900b(int i) {
        return this.f67969a[i];
    }

    /* renamed from: c */
    public final int m28899c() {
        return this.f67970b;
    }

    /* renamed from: d */
    public final boolean m28898d() {
        if (this.f67970b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m28897e(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (m28901a(i, i2)) {
                i4 += i3;
                m28891k(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        m28891k(i5, i2);
        return i5;
    }

    /* renamed from: f */
    public final int m28896f() {
        int[] iArr = this.f67969a;
        int i = this.f67970b - 1;
        this.f67970b = i;
        return iArr[i];
    }

    /* renamed from: g */
    public final void m28895g(int i, int i2, int i3) {
        int i4 = this.f67970b;
        int i5 = i4 + 3;
        int[] iArr = this.f67969a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f67969a = copyOf;
        }
        int[] iArr2 = this.f67969a;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f67970b = i5;
    }

    /* renamed from: h */
    public final void m28894h(int i, int i2, int i3, int i4) {
        int i5 = this.f67970b;
        int i6 = i5 + 4;
        int[] iArr = this.f67969a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f67969a = copyOf;
        }
        int[] iArr2 = this.f67969a;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f67970b = i6;
    }

    /* renamed from: i */
    public final void m28893i(int i, int i2, int i3) {
        if (i < i2) {
            int m28897e = m28897e(i, i2, i3);
            m28893i(i, m28897e - i3, i3);
            m28893i(m28897e + i3, i2, i3);
        }
    }

    /* renamed from: j */
    public final void m28892j() {
        int i = this.f67970b;
        if (i % 3 == 0) {
            if (i > 3) {
                m28893i(0, i - 3, 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: k */
    public final void m28891k(int i, int i2) {
        int[] iArr = this.f67969a;
        MyersDiffKt.m59433f(iArr, i, i2);
        MyersDiffKt.m59433f(iArr, i + 1, i2 + 1);
        MyersDiffKt.m59433f(iArr, i + 2, i2 + 2);
    }
}
