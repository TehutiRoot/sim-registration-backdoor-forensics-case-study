package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.d */
/* loaded from: classes5.dex */
public final class C10688d extends AttributeValue.AbstractC10672d {

    /* renamed from: a */
    public final String f63775a;

    public C10688d(String str) {
        if (str != null) {
            this.f63775a = str;
            return;
        }
        throw new NullPointerException("Null stringValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10672d
    /* renamed from: b */
    public String mo30477b() {
        return this.f63775a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10672d) {
            return this.f63775a.equals(((AttributeValue.AbstractC10672d) obj).mo30477b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63775a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueString{stringValue=" + this.f63775a + "}";
    }
}