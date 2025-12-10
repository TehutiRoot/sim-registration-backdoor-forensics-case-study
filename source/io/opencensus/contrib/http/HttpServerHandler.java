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
import io.opencensus.trace.Link;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanBuilder;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.Tracer;
import io.opencensus.trace.propagation.SpanContextParseException;
import io.opencensus.trace.propagation.TextFormat;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class HttpServerHandler<Q, P, C> extends AbstractC0839M {

    /* renamed from: b */
    public final TextFormat.Getter f63487b;

    /* renamed from: c */
    public final TextFormat f63488c;

    /* renamed from: d */
    public final Tracer f63489d;

    /* renamed from: e */
    public final Boolean f63490e;

    /* renamed from: f */
    public final StatsRecorder f63491f;

    /* renamed from: g */
    public final Tagger f63492g;

    public HttpServerHandler(Tracer tracer, HttpExtractor<Q, P> httpExtractor, TextFormat textFormat, TextFormat.Getter<C> getter, Boolean bool) {
        super(httpExtractor);
        Preconditions.checkNotNull(tracer, "tracer");
        Preconditions.checkNotNull(textFormat, "textFormat");
        Preconditions.checkNotNull(getter, "getter");
        Preconditions.checkNotNull(bool, "publicEndpoint");
        this.f63489d = tracer;
        this.f63488c = textFormat;
        this.f63487b = getter;
        this.f63490e = bool;
        this.f63491f = Stats.getStatsRecorder();
        this.f63492g = Tags.getTagger();
    }

    /* renamed from: g */
    private void m30265g(HttpRequestContext httpRequestContext, Object obj, int i) {
        String num;
        double millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - httpRequestContext.f63480a);
        String method = this.f3655a.getMethod(obj);
        String route = this.f3655a.getRoute(obj);
        TagContextBuilder builder = this.f63492g.toBuilder(httpRequestContext.f63486g);
        TagKey tagKey = HttpMeasureConstants.HTTP_SERVER_METHOD;
        if (method == null) {
            method = "";
        }
        TagValue create = TagValue.create(method);
        TagMetadata tagMetadata = HttpRequestContext.f63479h;
        TagContextBuilder put = builder.put(tagKey, create, tagMetadata);
        TagKey tagKey2 = HttpMeasureConstants.HTTP_SERVER_ROUTE;
        if (route == null) {
            route = "";
        }
        TagContextBuilder put2 = put.put(tagKey2, TagValue.create(route), tagMetadata);
        TagKey tagKey3 = HttpMeasureConstants.HTTP_SERVER_STATUS;
        if (i == 0) {
            num = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        } else {
            num = Integer.toString(i);
        }
        this.f63491f.newMeasureMap().put(HttpMeasureConstants.HTTP_SERVER_LATENCY, millis).put(HttpMeasureConstants.HTTP_SERVER_RECEIVED_BYTES, httpRequestContext.f63483d.get()).put(HttpMeasureConstants.HTTP_SERVER_SENT_BYTES, httpRequestContext.f63482c.get()).record(put2.put(tagKey3, TagValue.create(num), tagMetadata).build());
    }

    @Override // p000.AbstractC0839M
    public /* bridge */ /* synthetic */ Span getSpanFromContext(HttpRequestContext httpRequestContext) {
        return super.getSpanFromContext(httpRequestContext);
    }

    public void handleEnd(HttpRequestContext httpRequestContext, Q q, @Nullable P p, @Nullable Throwable th2) {
        Preconditions.checkNotNull(httpRequestContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        Preconditions.checkNotNull(q, "request");
        int statusCode = this.f3655a.getStatusCode(p);
        m30265g(httpRequestContext, q, statusCode);
        m67444f(httpRequestContext.f63481b, statusCode, th2);
    }

    public HttpRequestContext handleStart(C c, Q q) {
        SpanContext spanContext;
        SpanBuilder spanBuilder;
        Preconditions.checkNotNull(c, "carrier");
        Preconditions.checkNotNull(q, "request");
        String m67447c = m67447c(q, this.f3655a);
        try {
            spanContext = this.f63488c.extract(c, this.f63487b);
        } catch (SpanContextParseException unused) {
            spanContext = null;
        }
        if (spanContext != null && !this.f63490e.booleanValue()) {
            spanBuilder = this.f63489d.spanBuilderWithRemoteParent(m67447c, spanContext);
        } else {
            spanBuilder = this.f63489d.spanBuilder(m67447c);
        }
        Span startSpan = spanBuilder.setSpanKind(Span.Kind.SERVER).startSpan();
        if (this.f63490e.booleanValue() && spanContext != null) {
            startSpan.addLink(Link.fromSpanContext(spanContext, Link.Type.PARENT_LINKED_SPAN));
        }
        if (startSpan.getOptions().contains(Span.Options.RECORD_EVENTS)) {
            m67449a(startSpan, q, this.f3655a);
        }
        return m67448b(startSpan, this.f63492g.getCurrentTagContext());
    }
}
