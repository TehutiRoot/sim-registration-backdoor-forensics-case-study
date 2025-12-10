package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.b */
/* loaded from: classes5.dex */
public final class C10681b extends AttributeValue.AbstractC10670b {

    /* renamed from: a */
    public final Double f63761a;

    public C10681b(Double d) {
        if (d != null) {
            this.f63761a = d;
            return;
        }
        throw new NullPointerException("Null doubleValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10670b
    /* renamed from: b */
    public Double mo30481b() {
        return this.f63761a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10670b) {
            return this.f63761a.equals(((AttributeValue.AbstractC10670b) obj).mo30481b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63761a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueDouble{doubleValue=" + this.f63761a + "}";
    }
}