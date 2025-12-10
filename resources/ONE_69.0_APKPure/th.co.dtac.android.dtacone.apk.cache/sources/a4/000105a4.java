package p000;

import sun.misc.Unsafe;

/* renamed from: pI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21628pI2 extends AbstractC22493uI2 {
    public C21628pI2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: a */
    public final double mo1221a(Object obj, long j) {
        return Double.longBitsToDouble(m1211k(obj, j));
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: b */
    public final float mo1220b(Object obj, long j) {
        return Float.intBitsToFloat(m1212j(obj, j));
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: c */
    public final void mo1219c(Object obj, long j, boolean z) {
        if (AbstractC23185yI2.f109012h) {
            AbstractC23185yI2.m366d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC23185yI2.m365e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: d */
    public final void mo1218d(Object obj, long j, byte b) {
        if (AbstractC23185yI2.f109012h) {
            AbstractC23185yI2.m366d(obj, j, b);
        } else {
            AbstractC23185yI2.m365e(obj, j, b);
        }
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: e */
    public final void mo1217e(Object obj, long j, double d) {
        m1207o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: f */
    public final void mo1216f(Object obj, long j, float f) {
        m1208n(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC22493uI2
    /* renamed from: g */
    public final boolean mo1215g(Object obj, long j) {
        if (AbstractC23185yI2.f109012h) {
            return AbstractC23185yI2.m345y(obj, j);
        }
        return AbstractC23185yI2.m344z(obj, j);
    }
}