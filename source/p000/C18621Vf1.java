package p000;

import kotlin.ranges.OpenEndRange;

/* renamed from: Vf1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18621Vf1 implements OpenEndRange {

    /* renamed from: a */
    public final double f6769a;

    /* renamed from: b */
    public final double f6770b;

    public C18621Vf1(double d, double d2) {
        this.f6769a = d;
        this.f6770b = d2;
    }

    /* renamed from: a */
    public boolean m65749a(double d) {
        if (d >= this.f6769a && d < this.f6770b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: b */
    public Double getEndExclusive() {
        return Double.valueOf(this.f6770b);
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: c */
    public Double getStart() {
        return Double.valueOf(this.f6769a);
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m65749a(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18621Vf1) {
            if (!isEmpty() || !((C18621Vf1) obj).isEmpty()) {
                C18621Vf1 c18621Vf1 = (C18621Vf1) obj;
                if (this.f6769a != c18621Vf1.f6769a || this.f6770b != c18621Vf1.f6770b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.doubleToLongBits(this.f6769a) * 31) + Double.doubleToLongBits(this.f6770b);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        if (this.f6769a >= this.f6770b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f6769a + "..<" + this.f6770b;
    }
}
