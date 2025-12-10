package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;

/* renamed from: io.opencensus.trace.c */
/* loaded from: classes5.dex */
public final class C10682c extends AttributeValue.AbstractC10671c {

    /* renamed from: a */
    public final Long f63762a;

    public C10682c(Long l) {
        if (l != null) {
            this.f63762a = l;
            return;
        }
        throw new NullPointerException("Null longValue");
    }

    @Override // io.opencensus.trace.AttributeValue.AbstractC10671c
    /* renamed from: b */
    public Long mo30480b() {
        return this.f63762a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AbstractC10671c) {
            return this.f63762a.equals(((AttributeValue.AbstractC10671c) obj).mo30480b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63762a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueLong{longValue=" + this.f63762a + "}";
    }
}