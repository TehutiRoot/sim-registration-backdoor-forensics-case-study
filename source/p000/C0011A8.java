package p000;

import io.opencensus.metrics.LabelValue;

/* renamed from: A8 */
/* loaded from: classes5.dex */
public final class C0011A8 extends LabelValue {

    /* renamed from: a */
    public final String f25a;

    public C0011A8(String str) {
        this.f25a = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelValue)) {
            return false;
        }
        String str = this.f25a;
        String value = ((LabelValue) obj).getValue();
        if (str == null) {
            if (value == null) {
                return true;
            }
            return false;
        }
        return str.equals(value);
    }

    @Override // io.opencensus.metrics.LabelValue
    public String getValue() {
        return this.f25a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f25a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "LabelValue{value=" + this.f25a + "}";
    }
}
