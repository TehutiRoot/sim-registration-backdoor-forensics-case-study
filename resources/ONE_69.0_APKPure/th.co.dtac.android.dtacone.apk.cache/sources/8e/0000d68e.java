package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.ranges.ClosedFloatingPointRange;

/* renamed from: iq */
/* loaded from: classes5.dex */
public final class C11479iq implements ClosedFloatingPointRange {

    /* renamed from: a */
    public final float f67133a;

    /* renamed from: b */
    public final float f67134b;

    public C11479iq(float f, float f2) {
        this.f67133a = f;
        this.f67134b = f2;
    }

    /* renamed from: a */
    public boolean m29652a(float f) {
        if (f >= this.f67133a && f <= this.f67134b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: b */
    public Float getEndInclusive() {
        return Float.valueOf(this.f67134b);
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f67133a);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m29652a(((Number) comparable).floatValue());
    }

    /* renamed from: d */
    public boolean m29649d(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11479iq) {
            if (!isEmpty() || !((C11479iq) obj).isEmpty()) {
                C11479iq c11479iq = (C11479iq) obj;
                if (this.f67133a != c11479iq.f67133a || this.f67134b != c11479iq.f67134b) {
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
        return (Float.floatToIntBits(this.f67133a) * 31) + Float.floatToIntBits(this.f67134b);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        if (this.f67133a > this.f67134b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return m29649d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f67133a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f67134b;
    }
}