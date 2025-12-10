package p000;

import sun.misc.Unsafe;

/* renamed from: tH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22252tH2 extends AbstractC22940xH2 {
    public C22252tH2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: a */
    public final double mo581a(Object obj, long j) {
        return Double.longBitsToDouble(m571k(obj, j));
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: b */
    public final float mo580b(Object obj, long j) {
        return Float.intBitsToFloat(m572j(obj, j));
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: c */
    public final void mo579c(Object obj, long j, boolean z) {
        if (BH2.f363h) {
            BH2.m68946d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            BH2.m68945e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: d */
    public final void mo578d(Object obj, long j, byte b) {
        if (BH2.f363h) {
            BH2.m68946d(obj, j, b);
        } else {
            BH2.m68945e(obj, j, b);
        }
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: e */
    public final void mo577e(Object obj, long j, double d) {
        m567o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: f */
    public final void mo576f(Object obj, long j, float f) {
        m568n(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC22940xH2
    /* renamed from: g */
    public final boolean mo575g(Object obj, long j) {
        if (BH2.f363h) {
            return BH2.m68925y(obj, j);
        }
        return BH2.m68924z(obj, j);
    }
}
