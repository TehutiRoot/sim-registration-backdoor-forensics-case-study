package p000;

import kotlin.ranges.OpenEndRange;

/* renamed from: Sg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18473Sg1 implements OpenEndRange {

    /* renamed from: a */
    public final double f5884a;

    /* renamed from: b */
    public final double f5885b;

    public C18473Sg1(double d, double d2) {
        this.f5884a = d;
        this.f5885b = d2;
    }

    /* renamed from: a */
    public boolean m66477a(double d) {
        if (d >= this.f5884a && d < this.f5885b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: b */
    public Double getEndExclusive() {
        return Double.valueOf(this.f5885b);
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: c */
    public Double getStart() {
        return Double.valueOf(this.f5884a);
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m66477a(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18473Sg1) {
            if (!isEmpty() || !((C18473Sg1) obj).isEmpty()) {
                C18473Sg1 c18473Sg1 = (C18473Sg1) obj;
                if (this.f5884a != c18473Sg1.f5884a || this.f5885b != c18473Sg1.f5885b) {
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
        return (Double.doubleToLongBits(this.f5884a) * 31) + Double.doubleToLongBits(this.f5885b);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        if (this.f5884a >= this.f5885b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f5884a + "..<" + this.f5885b;
    }
}