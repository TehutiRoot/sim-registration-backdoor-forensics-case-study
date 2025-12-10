package p000;

import sun.misc.Unsafe;

/* renamed from: Lu2 */
/* loaded from: classes3.dex */
public final class Lu2 extends Wu2 {
    public Lu2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.Wu2
    /* renamed from: a */
    public final double mo65651a(Object obj, long j) {
        return Double.longBitsToDouble(this.f7422a.getLong(obj, j));
    }

    @Override // p000.Wu2
    /* renamed from: b */
    public final float mo65650b(Object obj, long j) {
        return Float.intBitsToFloat(this.f7422a.getInt(obj, j));
    }

    @Override // p000.Wu2
    /* renamed from: c */
    public final void mo65649c(Object obj, long j, boolean z) {
        if (AbstractC19310bv2.f39265h) {
            AbstractC19310bv2.m51815d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC19310bv2.m51814e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.Wu2
    /* renamed from: d */
    public final void mo65648d(Object obj, long j, byte b) {
        if (AbstractC19310bv2.f39265h) {
            AbstractC19310bv2.m51815d(obj, j, b);
        } else {
            AbstractC19310bv2.m51814e(obj, j, b);
        }
    }

    @Override // p000.Wu2
    /* renamed from: e */
    public final void mo65647e(Object obj, long j, double d) {
        this.f7422a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.Wu2
    /* renamed from: f */
    public final void mo65646f(Object obj, long j, float f) {
        this.f7422a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.Wu2
    /* renamed from: g */
    public final boolean mo65645g(Object obj, long j) {
        if (AbstractC19310bv2.f39265h) {
            return AbstractC19310bv2.m51794y(obj, j);
        }
        return AbstractC19310bv2.m51793z(obj, j);
    }
}