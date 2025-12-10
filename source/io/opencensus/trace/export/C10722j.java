package io.opencensus.trace.export;

import io.opencensus.trace.export.SpanData;
import java.util.List;

/* renamed from: io.opencensus.trace.export.j */
/* loaded from: classes5.dex */
public final class C10722j extends SpanData.Links {

    /* renamed from: a */
    public final List f63752a;

    /* renamed from: b */
    public final int f63753b;

    public C10722j(List list, int i) {
        if (list != null) {
            this.f63752a = list;
            this.f63753b = i;
            return;
        }
        throw new NullPointerException("Null links");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanData.Links)) {
            return false;
        }
        SpanData.Links links = (SpanData.Links) obj;
        if (this.f63752a.equals(links.getLinks()) && this.f63753b == links.getDroppedLinksCount()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SpanData.Links
    public int getDroppedLinksCount() {
        return this.f63753b;
    }

    @Override // io.opencensus.trace.export.SpanData.Links
    public List getLinks() {
        return this.f63752a;
    }

    public int hashCode() {
        return ((this.f63752a.hashCode() ^ 1000003) * 1000003) ^ this.f63753b;
    }

    public String toString() {
        return "Links{links=" + this.f63752a + ", droppedLinksCount=" + this.f63753b + "}";
    }
}
