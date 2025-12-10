package p000;

import kotlin.ranges.OpenEndRange;

/* renamed from: Wf1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18685Wf1 implements OpenEndRange {

    /* renamed from: a */
    public final float f7261a;

    /* renamed from: b */
    public final float f7262b;

    public C18685Wf1(float f, float f2) {
        this.f7261a = f;
        this.f7262b = f2;
    }

    /* renamed from: a */
    public boolean m65587a(float f) {
        if (f >= this.f7261a && f < this.f7262b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: b */
    public Float getEndExclusive() {
        return Float.valueOf(this.f7262b);
    }

    @Override // kotlin.ranges.OpenEndRange
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f7261a);
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m65587a(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18685Wf1) {
            if (!isEmpty() || !((C18685Wf1) obj).isEmpty()) {
                C18685Wf1 c18685Wf1 = (C18685Wf1) obj;
                if (this.f7261a != c18685Wf1.f7261a || this.f7262b != c18685Wf1.f7262b) {
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
        return (Float.floatToIntBits(this.f7261a) * 31) + Float.floatToIntBits(this.f7262b);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        if (this.f7261a >= this.f7262b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f7261a + "..<" + this.f7262b;
    }
}
