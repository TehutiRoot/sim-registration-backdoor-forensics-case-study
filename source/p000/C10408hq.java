package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.ranges.ClosedFloatingPointRange;

/* renamed from: hq */
/* loaded from: classes5.dex */
public final class C10408hq implements ClosedFloatingPointRange {

    /* renamed from: a */
    public final double f62606a;

    /* renamed from: b */
    public final double f62607b;

    public C10408hq(double d, double d2) {
        this.f62606a = d;
        this.f62607b = d2;
    }

    /* renamed from: a */
    public boolean m30748a(double d) {
        if (d >= this.f62606a && d <= this.f62607b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: b */
    public Double getEndInclusive() {
        return Double.valueOf(this.f62607b);
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: c */
    public Double getStart() {
        return Double.valueOf(this.f62606a);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m30748a(((Number) comparable).doubleValue());
    }

    /* renamed from: d */
    public boolean m30745d(double d, double d2) {
        if (d <= d2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10408hq) {
            if (!isEmpty() || !((C10408hq) obj).isEmpty()) {
                C10408hq c10408hq = (C10408hq) obj;
                if (this.f62606a != c10408hq.f62606a || this.f62607b != c10408hq.f62607b) {
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
        return (Double.doubleToLongBits(this.f62606a) * 31) + Double.doubleToLongBits(this.f62607b);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        if (this.f62606a > this.f62607b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return m30745d(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        return this.f62606a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f62607b;
    }
}
