package p000;

import androidx.compose.p003ui.platform.OpenEndRange;

/* renamed from: Xf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18749Xf1 implements OpenEndRange {

    /* renamed from: a */
    public final float f7544a;

    /* renamed from: b */
    public final float f7545b;

    public C18749Xf1(float f, float f2) {
        this.f7544a = f;
        this.f7545b = f2;
    }

    /* renamed from: a */
    public boolean m65455a(float f) {
        if (f >= this.f7544a && f < this.f7545b) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    /* renamed from: b */
    public Float getEndExclusive() {
        return Float.valueOf(this.f7545b);
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f7544a);
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m65455a(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18749Xf1) {
            if (!isEmpty() || !((C18749Xf1) obj).isEmpty()) {
                C18749Xf1 c18749Xf1 = (C18749Xf1) obj;
                if (this.f7544a != c18749Xf1.f7544a || this.f7545b != c18749Xf1.f7545b) {
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
        return (Float.floatToIntBits(this.f7544a) * 31) + Float.floatToIntBits(this.f7545b);
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    public boolean isEmpty() {
        if (this.f7544a >= this.f7545b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f7544a + "..<" + this.f7545b;
    }
}
