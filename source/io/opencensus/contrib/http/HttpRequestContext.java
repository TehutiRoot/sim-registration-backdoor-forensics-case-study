package io.opencensus.contrib.http;

import com.google.common.base.Preconditions;
import io.opencensus.tags.TagContext;
import io.opencensus.tags.TagMetadata;
import io.opencensus.trace.Span;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public class HttpRequestContext {

    /* renamed from: h */
    public static final TagMetadata f63479h = TagMetadata.create(TagMetadata.TagTtl.NO_PROPAGATION);

    /* renamed from: a */
    public final long f63480a;

    /* renamed from: b */
    public final Span f63481b;

    /* renamed from: c */
    public AtomicLong f63482c = new AtomicLong();

    /* renamed from: d */
    public AtomicLong f63483d = new AtomicLong();

    /* renamed from: e */
    public AtomicLong f63484e = new AtomicLong();

    /* renamed from: f */
    public AtomicLong f63485f = new AtomicLong();

    /* renamed from: g */
    public final TagContext f63486g;

    public HttpRequestContext(Span span, TagContext tagContext) {
        Preconditions.checkNotNull(span, "span");
        Preconditions.checkNotNull(tagContext, "tagContext");
        this.f63481b = span;
        this.f63486g = tagContext;
        this.f63480a = System.nanoTime();
    }
}
