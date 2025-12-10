package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.d */
/* loaded from: classes5.dex */
public final class C10701d extends AttributeValue.AbstractC10685d {

    /* renamed from: a */
    public final String f63712a;

    public C10701d(String str) {
        if (str != null) {
            this.f63712a = str;
            return;
        }
        throw new NullPointerException("Null stringValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10685d
    /* renamed from: b */
    public String mo30137b() {
        return this.f63712a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10685d) {
            return this.f63712a.equals(((AttributeValue.AbstractC10685d) obj).mo30137b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63712a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueString{stringValue=" + this.f63712a + "}";
    }
}
