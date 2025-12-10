package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.b */
/* loaded from: classes5.dex */
public final class C10694b extends AttributeValue.AbstractC10683b {

    /* renamed from: a */
    public final Double f63698a;

    public C10694b(Double d) {
        if (d != null) {
            this.f63698a = d;
            return;
        }
        throw new NullPointerException("Null doubleValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10683b
    /* renamed from: b */
    public Double mo30141b() {
        return this.f63698a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10683b) {
            return this.f63698a.equals(((AttributeValue.AbstractC10683b) obj).mo30141b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63698a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueDouble{doubleValue=" + this.f63698a + "}";
    }
}
