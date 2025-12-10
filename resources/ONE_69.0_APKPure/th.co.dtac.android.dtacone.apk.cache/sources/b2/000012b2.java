package p000;

import kotlin.ranges.OpenEndRange;

/* renamed from: Tg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18538Tg1 implements OpenEndRange {

    /* renamed from: a */
    public final float f6394a;

    /* renamed from: b */
    public final float f6395b;

    public C18538Tg1(float f, float f2) {
        this.f6394a = f;
        this.f6395b = f2;
    }

    /* renamed from: a */
    public boolean m66326a(float f) {
        if (f >= this.f6394a && f < this.f6395b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: b */
    public Float getEndExclusive() {
        return Float.valueOf(this.f6395b);
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f6394a);
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m66326a(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18538Tg1) {
            if (!isEmpty() || !((C18538Tg1) obj).isEmpty()) {
                C18538Tg1 c18538Tg1 = (C18538Tg1) obj;
                if (this.f6394a != c18538Tg1.f6394a || this.f6395b != c18538Tg1.f6395b) {
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
        return (Float.floatToIntBits(this.f6394a) * 31) + Float.floatToIntBits(this.f6395b);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        if (this.f6394a >= this.f6395b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f6394a + "..<" + this.f6395b;
    }
}