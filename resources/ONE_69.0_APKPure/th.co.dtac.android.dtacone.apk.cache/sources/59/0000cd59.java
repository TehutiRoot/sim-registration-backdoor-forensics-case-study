package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.a */
/* loaded from: classes5.dex */
public final class C10680a extends AttributeValue.AbstractC10669a {

    /* renamed from: a */
    public final Boolean f63760a;

    public C10680a(Boolean bool) {
        if (bool != null) {
            this.f63760a = bool;
            return;
        }
        throw new NullPointerException("Null booleanValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10669a
    /* renamed from: b */
    public Boolean mo30482b() {
        return this.f63760a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10669a) {
            return this.f63760a.equals(((AttributeValue.AbstractC10669a) obj).mo30482b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63760a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueBoolean{booleanValue=" + this.f63760a + "}";
    }
}