package p000;

import sun.misc.Unsafe;

/* renamed from: Tt2 */
/* loaded from: classes3.dex */
public final class Tt2 extends Zt2 {
    public Tt2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.Zt2
    /* renamed from: a */
    public final double mo65139a(Object obj, long j) {
        return Double.longBitsToDouble(this.f8173a.getLong(obj, j));
    }

    @Override // p000.Zt2
    /* renamed from: b */
    public final float mo65138b(Object obj, long j) {
        return Float.intBitsToFloat(this.f8173a.getInt(obj, j));
    }

    @Override // p000.Zt2
    /* renamed from: c */
    public final void mo65137c(Object obj, long j, boolean z) {
        if (AbstractC19775eu2.f61658h) {
            AbstractC19775eu2.m31408d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC19775eu2.m31407e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.Zt2
    /* renamed from: d */
    public final void mo65136d(Object obj, long j, byte b) {
        if (AbstractC19775eu2.f61658h) {
            AbstractC19775eu2.m31408d(obj, j, b);
        } else {
            AbstractC19775eu2.m31407e(obj, j, b);
        }
    }

    @Override // p000.Zt2
    /* renamed from: e */
    public final void mo65135e(Object obj, long j, double d) {
        this.f8173a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.Zt2
    /* renamed from: f */
    public final void mo65134f(Object obj, long j, float f) {
        this.f8173a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.Zt2
    /* renamed from: g */
    public final boolean mo65133g(Object obj, long j) {
        if (AbstractC19775eu2.f61658h) {
            return AbstractC19775eu2.m31387y(obj, j);
        }
        return AbstractC19775eu2.m31386z(obj, j);
    }
}
