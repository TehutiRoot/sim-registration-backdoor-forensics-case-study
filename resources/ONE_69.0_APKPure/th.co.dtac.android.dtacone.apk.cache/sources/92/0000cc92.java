package io.opencensus.metrics.data;

import io.opencensus.metrics.data.AttachmentValue;

/* renamed from: io.opencensus.metrics.data.a */
/* loaded from: classes5.dex */
public final class C10588a extends AttachmentValue.AttachmentValueString {

    /* renamed from: a */
    public final String f63607a;

    public C10588a(String str) {
        if (str != null) {
            this.f63607a = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttachmentValue.AttachmentValueString) {
            return this.f63607a.equals(((AttachmentValue.AttachmentValueString) obj).getValue());
        }
        return false;
    }

    @Override // io.opencensus.metrics.data.AttachmentValue
    public String getValue() {
        return this.f63607a;
    }

    public int hashCode() {
        return this.f63607a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttachmentValueString{value=" + this.f63607a + "}";
    }
}