package io.opencensus.contrib.http;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import com.google.firebase.messaging.Constants;
import io.opencensus.contrib.http.util.HttpMeasureConstants;
import io.opencensus.stats.Stats;
import io.opencensus.stats.StatsRecorder;
import io.opencensus.tags.TagContextBuilder;
import io.opencensus.tags.TagKey;
import io.opencensus.tags.TagMetadata;
import io.opencensus.tags.TagValue;
import io.opencensus.tags.Tagger;
import io.opencensus.tags.Tags;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.Tracer;
import io.opencensus.trace.propagation.TextFormat;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class HttpClientHandler<Q, P, C> extends AbstractC0839M {

    /* renamed from: b */
    public final TextFormat.Setter f63474b;

    /* renamed from: c */
    public final TextFormat f63475c;

    /* renamed from: d */
    public final Tracer f63476d;

    /* renamed from: e */
    public final StatsRecorder f63477e;

    /* renamed from: f */
    public final Tagger f63478f;

    public HttpClientHandler(Tracer tracer, HttpExtractor<Q, P> httpExtractor, TextFormat textFormat, TextFormat.Setter<C> setter) {
        super(httpExtractor);
        Preconditions.checkNotNull(setter, "setter");
        Preconditions.checkNotNull(textFormat, "textFormat");
        Preconditions.checkNotNull(tracer, "tracer");
        this.f63474b = setter;
        this.f63475c = textFormat;
        this.f63476d = tracer;
        this.f63477e = Stats.getStatsRecorder();
        this.f63478f = Tags.getTagger();
    }

    /* renamed from: g */
    public final void m30266g(HttpRequestContext httpRequestContext, Object obj, int i) {
        String method;
        String host;
        String num;
        double millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - httpRequestContext.f63480a);
        String str = "";
        if (obj == null) {
            method = "";
        } else {
            method = this.f3655a.getMethod(obj);
        }
        if (obj == null) {
            host = "null_request";
        } else {
            host = this.f3655a.getHost(obj);
        }
        TagContextBuilder builder = this.f63478f.toBuilder(httpRequestContext.f63486g);
        TagKey tagKey = HttpMeasureConstants.HTTP_CLIENT_HOST;
        if (host == null) {
            host = "null_host";
        }
        TagValue create = TagValue.create(host);
        TagMetadata tagMetadata = HttpRequestContext.f63479h;
        TagContextBuilder put = builder.put(tagKey, create, tagMetadata);
        TagKey tagKey2 = HttpMeasureConstants.HTTP_CLIENT_METHOD;
        if (method != null) {
            str = method;
        }
        TagContextBuilder put2 = put.put(tagKey2, TagValue.create(str), tagMetadata);
        TagKey tagKey3 = HttpMeasureConstants.HTTP_CLIENT_STATUS;
        if (i == 0) {
            num = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        } else {
            num = Integer.toString(i);
        }
        this.f63477e.newMeasureMap().put(HttpMeasureConstants.HTTP_CLIENT_ROUNDTRIP_LATENCY, millis).put(HttpMeasureConstants.HTTP_CLIENT_SENT_BYTES, httpRequestContext.f63482c.get()).put(HttpMeasureConstants.HTTP_CLIENT_RECEIVED_BYTES, httpRequestContext.f63483d.get()).record(put2.put(tagKey3, TagValue.create(num), tagMetadata).build());
    }

    @Override // p000.AbstractC0839M
    public /* bridge */ /* synthetic */ Span getSpanFromContext(HttpRequestContext httpRequestContext) {
        return super.getSpanFromContext(httpRequestContext);
    }

    public void handleEnd(HttpRequestContext httpRequestContext, @Nullable Q q, @Nullable P p, @Nullable Throwable th2) {
        Preconditions.checkNotNull(httpRequestContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        int statusCode = this.f3655a.getStatusCode(p);
        m30266g(httpRequestContext, q, statusCode);
        m67444f(httpRequestContext.f63481b, statusCode, th2);
    }

    public HttpRequestContext handleStart(@Nullable Span span, C c, Q q) {
        Preconditions.checkNotNull(c, "carrier");
        Preconditions.checkNotNull(q, "request");
        if (span == null) {
            span = this.f63476d.getCurrentSpan();
        }
        Span startSpan = this.f63476d.spanBuilderWithExplicitParent(m67447c(q, this.f3655a), span).setSpanKind(Span.Kind.CLIENT).startSpan();
        if (startSpan.getOptions().contains(Span.Options.RECORD_EVENTS)) {
            m67449a(startSpan, q, this.f3655a);
        }
        SpanContext context = startSpan.getContext();
        if (!context.equals(SpanContext.INVALID)) {
            this.f63475c.inject(context, c, this.f63474b);
        }
        return m67448b(startSpan, this.f63478f.getCurrentTagContext());
    }
}
