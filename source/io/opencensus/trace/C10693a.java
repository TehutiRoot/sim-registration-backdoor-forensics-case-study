package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.a */
/* loaded from: classes5.dex */
public final class C10693a extends AttributeValue.AbstractC10682a {

    /* renamed from: a */
    public final Boolean f63697a;

    public C10693a(Boolean bool) {
        if (bool != null) {
            this.f63697a = bool;
            return;
        }
        throw new NullPointerException("Null booleanValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10682a
    /* renamed from: b */
    public Boolean mo30142b() {
        return this.f63697a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10682a) {
            return this.f63697a.equals(((AttributeValue.AbstractC10682a) obj).mo30142b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63697a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueBoolean{booleanValue=" + this.f63697a + "}";
    }
}
