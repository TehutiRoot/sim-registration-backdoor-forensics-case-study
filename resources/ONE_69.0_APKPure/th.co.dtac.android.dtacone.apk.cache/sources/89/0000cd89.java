package io.opencensus.trace.export;

import io.opencensus.common.Timestamp;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.Status;
import io.opencensus.trace.export.SpanData;

/* renamed from: io.opencensus.trace.export.h */
/* loaded from: classes5.dex */
public final class C10707h extends SpanData {

    /* renamed from: a */
    public final SpanContext f63800a;

    /* renamed from: b */
    public final SpanId f63801b;

    /* renamed from: c */
    public final Boolean f63802c;

    /* renamed from: d */
    public final String f63803d;

    /* renamed from: e */
    public final Span.Kind f63804e;

    /* renamed from: f */
    public final Timestamp f63805f;

    /* renamed from: g */
    public final SpanData.Attributes f63806g;

    /* renamed from: h */
    public final SpanData.TimedEvents f63807h;

    /* renamed from: i */
    public final SpanData.TimedEvents f63808i;

    /* renamed from: j */
    public final SpanData.Links f63809j;

    /* renamed from: k */
    public final Integer f63810k;

    /* renamed from: l */
    public final Status f63811l;

    /* renamed from: m */
    public final Timestamp f63812m;

    public C10707h(SpanContext spanContext, SpanId spanId, Boolean bool, String str, Span.Kind kind, Timestamp timestamp, SpanData.Attributes attributes, SpanData.TimedEvents timedEvents, SpanData.TimedEvents timedEvents2, SpanData.Links links, Integer num, Status status, Timestamp timestamp2) {
        if (spanContext != null) {
            this.f63800a = spanContext;
            this.f63801b = spanId;
            this.f63802c = bool;
            if (str != null) {
                this.f63803d = str;
                this.f63804e = kind;
                if (timestamp != null) {
                    this.f63805f = timestamp;
                    if (attributes != null) {
                        this.f63806g = attributes;
                        if (timedEvents != null) {
                            this.f63807h = timedEvents;
                            if (timedEvents2 != null) {
                                this.f63808i = timedEvents2;
                                if (links != null) {
                                    this.f63809j = links;
                                    this.f63810k = num;
                                    this.f63811l = status;
                                    this.f63812m = timestamp2;
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
        if (this.f63800a.equals(spanData.getContext()) && ((spanId = this.f63801b) != null ? spanId.equals(spanData.getParentSpanId()) : spanData.getParentSpanId() == null) && ((bool = this.f63802c) != null ? bool.equals(spanData.getHasRemoteParent()) : spanData.getHasRemoteParent() == null) && this.f63803d.equals(spanData.getName()) && ((kind = this.f63804e) != null ? kind.equals(spanData.getKind()) : spanData.getKind() == null) && this.f63805f.equals(spanData.getStartTimestamp()) && this.f63806g.equals(spanData.getAttributes()) && this.f63807h.equals(spanData.getAnnotations()) && this.f63808i.equals(spanData.getMessageEvents()) && this.f63809j.equals(spanData.getLinks()) && ((num = this.f63810k) != null ? num.equals(spanData.getChildSpanCount()) : spanData.getChildSpanCount() == null) && ((status = this.f63811l) != null ? status.equals(spanData.getStatus()) : spanData.getStatus() == null)) {
            Timestamp timestamp = this.f63812m;
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
        return this.f63807h;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.Attributes getAttributes() {
        return this.f63806g;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Integer getChildSpanCount() {
        return this.f63810k;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanContext getContext() {
        return this.f63800a;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Timestamp getEndTimestamp() {
        return this.f63812m;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Boolean getHasRemoteParent() {
        return this.f63802c;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Span.Kind getKind() {
        return this.f63804e;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.Links getLinks() {
        return this.f63809j;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanData.TimedEvents getMessageEvents() {
        return this.f63808i;
    }

    @Override // io.opencensus.trace.export.SpanData
    public String getName() {
        return this.f63803d;
    }

    @Override // io.opencensus.trace.export.SpanData
    public SpanId getParentSpanId() {
        return this.f63801b;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Timestamp getStartTimestamp() {
        return this.f63805f;
    }

    @Override // io.opencensus.trace.export.SpanData
    public Status getStatus() {
        return this.f63811l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (this.f63800a.hashCode() ^ 1000003) * 1000003;
        SpanId spanId = this.f63801b;
        int i = 0;
        if (spanId == null) {
            hashCode = 0;
        } else {
            hashCode = spanId.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        Boolean bool = this.f63802c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int hashCode7 = (((i2 ^ hashCode2) * 1000003) ^ this.f63803d.hashCode()) * 1000003;
        Span.Kind kind = this.f63804e;
        if (kind == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = kind.hashCode();
        }
        int hashCode8 = (((((((((((hashCode7 ^ hashCode3) * 1000003) ^ this.f63805f.hashCode()) * 1000003) ^ this.f63806g.hashCode()) * 1000003) ^ this.f63807h.hashCode()) * 1000003) ^ this.f63808i.hashCode()) * 1000003) ^ this.f63809j.hashCode()) * 1000003;
        Integer num = this.f63810k;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i3 = (hashCode8 ^ hashCode4) * 1000003;
        Status status = this.f63811l;
        if (status == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = status.hashCode();
        }
        int i4 = (i3 ^ hashCode5) * 1000003;
        Timestamp timestamp = this.f63812m;
        if (timestamp != null) {
            i = timestamp.hashCode();
        }
        return i4 ^ i;
    }

    public String toString() {
        return "SpanData{context=" + this.f63800a + ", parentSpanId=" + this.f63801b + ", hasRemoteParent=" + this.f63802c + ", name=" + this.f63803d + ", kind=" + this.f63804e + ", startTimestamp=" + this.f63805f + ", attributes=" + this.f63806g + ", annotations=" + this.f63807h + ", messageEvents=" + this.f63808i + ", links=" + this.f63809j + ", childSpanCount=" + this.f63810k + ", status=" + this.f63811l + ", endTimestamp=" + this.f63812m + "}";
    }
}