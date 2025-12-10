package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.c */
/* loaded from: classes5.dex */
public final class C10695c extends AttributeValue.AbstractC10684c {

    /* renamed from: a */
    public final Long f63699a;

    public C10695c(Long l) {
        if (l != null) {
            this.f63699a = l;
            return;
        }
        throw new NullPointerException("Null longValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10684c
    /* renamed from: b */
    public Long mo30140b() {
        return this.f63699a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10684c) {
            return this.f63699a.equals(((AttributeValue.AbstractC10684c) obj).mo30140b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63699a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueLong{longValue=" + this.f63699a + "}";
    }
}
