package p000;

import androidx.compose.p003ui.platform.OpenEndRange;

/* renamed from: Ug1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18603Ug1 implements OpenEndRange {

    /* renamed from: a */
    public final float f6684a;

    /* renamed from: b */
    public final float f6685b;

    public C18603Ug1(float f, float f2) {
        this.f6684a = f;
        this.f6685b = f2;
    }

    /* renamed from: a */
    public boolean m66116a(float f) {
        if (f >= this.f6684a && f < this.f6685b) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    /* renamed from: b */
    public Float getEndExclusive() {
        return Float.valueOf(this.f6685b);
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f6684a);
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m66116a(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18603Ug1) {
            if (!isEmpty() || !((C18603Ug1) obj).isEmpty()) {
                C18603Ug1 c18603Ug1 = (C18603Ug1) obj;
                if (this.f6684a != c18603Ug1.f6684a || this.f6685b != c18603Ug1.f6685b) {
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
        return (Float.floatToIntBits(this.f6684a) * 31) + Float.floatToIntBits(this.f6685b);
    }

    @Override // androidx.compose.p003ui.platform.OpenEndRange
    public boolean isEmpty() {
        if (this.f6684a >= this.f6685b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f6684a + "..<" + this.f6685b;
    }
}