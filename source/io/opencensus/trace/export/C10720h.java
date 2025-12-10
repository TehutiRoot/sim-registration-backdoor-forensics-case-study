package io.opencensus.trace.export;

import io.opencensus.common.Timestamp;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.Status;
import io.opencensus.trace.export.SpanData;

/* renamed from: io.opencensus.trace.export.h */
/* loaded from: classes5.dex */
public final class C10720h extends SpanData {

    /* renamed from: a */
    public final SpanContext f63737a;

    /* renamed from: b */
    public final SpanId f63738b;

    /* renamed from: c */
    public final Boolean f63739c;

    /* renamed from: d */
    public final String f63740d;

    /* renamed from: e */
    public final Span.Kind f63741e;

    /* renamed from: f */
    public final Timestamp f63742f;

    /* renamed from: g */
    public final SpanData.Attributes f63743g;

    /* renamed from: h */
    public final SpanData.TimedEvents f63744h;

    /* renamed from: i */
    public final SpanData.TimedEvents f63745i;

    /* renamed from: j */
    public final SpanData.Links f63746j;

    /* renamed from: k */
    public final Integer f63747k;

    /* renamed from: l */
    public final Status f63748l;

    /* renamed from: m */
    public final Timestamp f63749m;

    public C10720h(SpanContext spanContext, SpanId spanId, Boolean bool, String str, Span.Kind kind, Timestamp timestamp, SpanData.Attributes attributes, SpanData.TimedEvents timedEvents, SpanData.TimedEvents timedEvents2, SpanData.Links links, Integer num, Status status, Timestamp timestamp2) {
        if (spanContext != null) {
            this.f63737a = spanContext;
            this.f63738b = spanId;
            this.f63739c = bool;
            if (str != null) {
                this.f63740d = str;
                this.f63741e = kind;
                if (timestamp != null) {
                    this.f63742f = timestamp;
                    if (attributes != null) {
                        this.f63743g = attributes;
                        if (timedEvents != null) {
                            this.f63744h = timedEvents;
                            if (timedEvents2 != null) {
                                this.f63745i = timedEvents2;
                                if (links != null) {
                                    this.f63746j = links;
                                    this.f63747k = num;
                                    this.f63748l = status;
                                    this.f63749m = timestamp2;
                                    return;
                                }
                                throw new NullPointerException("Null links");
                            }
                            throw new NullPointerException("Null messageEvents");
                        }
                        throw new NullPointerException("Null annotations");
                    }
                    throw new NullPointerException("Null attributes");
                }
                throw new NullPointerException("Null startTimestamp");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null context");
    }

    public boolean equals(Object obj) {
        SpanId spanId;
        Boolean bool;
        Span.Kind kind;
        Integer num;
        Status status;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanData)) {
            return false;
        }
        SpanData spanData = (SpanData) obj;
        if (this.f63737a.equals(spanData.getContext()) && ((spanId = this.f63738b) != null ? spanId.equals(spanData.getParentSpanId()) : spanData.getParentSpanId() == null) && ((bool = this.f63739c) != null ? bool.equals(spanData.getHasRemoteParent()) : spanData.getHasRemoteParent() == null) && this.f63740d.equals(spanData.getName()) && ((kind = this.f63741e) != null ? kind.equals(spanData.getKind()) : spanData.getKind() == null) && this.f63742f.equals(spanData.getStartTimestamp()) && this.f63743g.equals(spanData.getAttributes()) && this.f63744h.equals(spanData.getAnnotations()) && this.f63745i.equals(spanData.getMessageEvents()) && this.f63746j.equals(spanData.getLinks()) && ((num = this.f63747k) != null ? num.equals(spanData.getChildSpanCount()) : spanData.getChildSpanCount() == null) && ((status = this.f63748l) != null ? status.equals(spanData.getStatus()) : spanData.getStatus() == null)) {
            Timestamp timestamp = this.f63749m;
            if (timestamp == null) {
                if (spanData.getEndTimestamp() == null) {
                    return true;
                }
            } else if (timestamp.equals(spanData.getEndTimestamp())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.TimedEvents getAnnotations() {
        return this.f63744h;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.Attributes getAttributes() {
        return this.f63743g;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Integer getChildSpanCount() {
        return this.f63747k;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanContext getContext() {
        return this.f63737a;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Timestamp getEndTimestamp() {
        return this.f63749m;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Boolean getHasRemoteParent() {
        return this.f63739c;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Span.Kind getKind() {
        return this.f63741e;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.Links getLinks() {
        return this.f63746j;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.TimedEvents getMessageEvents() {
        return this.f63745i;
    }

    @Override // io.opencensus.trace.export.SpanData
    public String getName() {
        return this.f63740d;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanId getParentSpanId() {
        return this.f63738b;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Timestamp getStartTimestamp() {
        return this.f63742f;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Status getStatus() {
        return this.f63748l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (this.f63737a.hashCode() ^ 1000003) * 1000003;
        SpanId spanId = this.f63738b;
        int i = 0;
        if (spanId == null) {
            hashCode = 0;
        } else {
            hashCode = spanId.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        Boolean bool = this.f63739c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int hashCode7 = (((i2 ^ hashCode2) * 1000003) ^ this.f63740d.hashCode()) * 1000003;
        Span.Kind kind = this.f63741e;
        if (kind == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = kind.hashCode();
        }
        int hashCode8 = (((((((((((hashCode7 ^ hashCode3) * 1000003) ^ this.f63742f.hashCode()) * 1000003) ^ this.f63743g.hashCode()) * 1000003) ^ this.f63744h.hashCode()) * 1000003) ^ this.f63745i.hashCode()) * 1000003) ^ this.f63746j.hashCode()) * 1000003;
        Integer num = this.f63747k;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i3 = (hashCode8 ^ hashCode4) * 1000003;
        Status status = this.f63748l;
        if (status == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = status.hashCode();
        }
        int i4 = (i3 ^ hashCode5) * 1000003;
        Timestamp timestamp = this.f63749m;
        if (timestamp != null) {
            i = timestamp.hashCode();
        }
        return i4 ^ i;
    }

    public String toString() {
        return "SpanData{context=" + this.f63737a + ", parentSpanId=" + this.f63738b + ", hasRemoteParent=" + this.f63739c + ", name=" + this.f63740d + ", kind=" + this.f63741e + ", startTimestamp=" + this.f63742f + ", attributes=" + this.f63743g + ", annotations=" + this.f63744h + ", messageEvents=" + this.f63745i + ", links=" + this.f63746j + ", childSpanCount=" + this.f63747k + ", status=" + this.f63748l + ", endTimestamp=" + this.f63749m + "}";
    }
}
