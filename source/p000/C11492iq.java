package p000;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.ranges.ClosedFloatingPointRange;

/* renamed from: iq */
/* loaded from: classes5.dex */
public final class C11492iq implements ClosedFloatingPointRange {

    /* renamed from: a */
    public final float f67066a;

    /* renamed from: b */
    public final float f67067b;

    public C11492iq(float f, float f2) {
        this.f67066a = f;
        this.f67067b = f2;
    }

    /* renamed from: a */
    public boolean m29312a(float f) {
        if (f >= this.f67066a && f <= this.f67067b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: b */
    public Float getEndInclusive() {
        return Float.valueOf(this.f67067b);
    }

    @Override // kotlin.ranges.ClosedRange
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f67066a);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m29312a(((Number) comparable).floatValue());
    }

    /* renamed from: d */
    public boolean m29309d(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11492iq) {
            if (!isEmpty() || !((C11492iq) obj).isEmpty()) {
                C11492iq c11492iq = (C11492iq) obj;
                if (this.f67066a != c11492iq.f67066a || this.f67067b != c11492iq.f67067b) {
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
        return (Float.floatToIntBits(this.f67066a) * 31) + Float.floatToIntBits(this.f67067b);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        if (this.f67066a > this.f67067b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return m29309d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f67066a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f67067b;
    }
}
