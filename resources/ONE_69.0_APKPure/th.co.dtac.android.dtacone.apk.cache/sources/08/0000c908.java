package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.ranges.ClosedFloatingPointRange;

/* renamed from: hq */
/* loaded from: classes5.dex */
public final class C10394hq implements ClosedFloatingPointRange {

    /* renamed from: a */
    public final double f62669a;

    /* renamed from: b */
    public final double f62670b;

    public C10394hq(double d, double d2) {
        this.f62669a = d;
        this.f62670b = d2;
    }

    /* renamed from: a */
    public boolean m31098a(double d) {
        if (d >= this.f62669a && d <= this.f62670b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: b */
    public Double getEndInclusive() {
        return Double.valueOf(this.f62670b);
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: c */
    public Double getStart() {
        return Double.valueOf(this.f62669a);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m31098a(((Number) comparable).doubleValue());
    }

    /* renamed from: d */
    public boolean m31095d(double d, double d2) {
        if (d <= d2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10394hq) {
            if (!isEmpty() || !((C10394hq) obj).isEmpty()) {
                C10394hq c10394hq = (C10394hq) obj;
                if (this.f62669a != c10394hq.f62669a || this.f62670b != c10394hq.f62670b) {
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
        return (Double.doubleToLongBits(this.f62669a) * 31) + Double.doubleToLongBits(this.f62670b);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        if (this.f62669a > this.f62670b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return m31095d(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        return this.f62669a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f62670b;
    }
}