package io.opencensus.trace.export;

import io.opencensus.trace.export.SpanData;
import java.util.Map;

/* renamed from: io.opencensus.trace.export.i */
/* loaded from: classes5.dex */
public final class C10708i extends SpanData.Attributes {

    /* renamed from: a */
    public final Map f63813a;

    /* renamed from: b */
    public final int f63814b;

    public C10708i(Map map, int i) {
        if (map != null) {
            this.f63813a = map;
            this.f63814b = i;
            return;
        }
        throw new NullPointerException("Null attributeMap");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanData.Attributes)) {
            return false;
        }
        SpanData.Attributes attributes = (SpanData.Attributes) obj;
        if (this.f63813a.equals(attributes.getAttributeMap()) && this.f63814b == attributes.getDroppedAttributesCount()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SpanData.Attributes
    public Map getAttributeMap() {
        return this.f63813a;
    }

    @Override // io.opencensus.trace.export.SpanData.Attributes
    public int getDroppedAttributesCount() {
        return this.f63814b;
    }

    public int hashCode() {
        return ((this.f63813a.hashCode() ^ 1000003) * 1000003) ^ this.f63814b;
    }

    public String toString() {
        return "Attributes{attributeMap=" + this.f63813a + ", droppedAttributesCount=" + this.f63814b + "}";
    }
}