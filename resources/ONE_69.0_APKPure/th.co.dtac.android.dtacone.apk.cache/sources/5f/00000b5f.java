package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.opencensus.contrib.http.HttpExtractor;
import io.opencensus.contrib.http.HttpRequestContext;
import io.opencensus.contrib.http.util.HttpTraceAttributeConstants;
import io.opencensus.contrib.http.util.HttpTraceUtil;
import io.opencensus.tags.TagContext;
import io.opencensus.trace.AttributeValue;
import io.opencensus.trace.MessageEvent;
import io.opencensus.trace.Span;

/* renamed from: M */
/* loaded from: classes5.dex */
public abstract class AbstractC0835M {

    /* renamed from: a */
    public final HttpExtractor f3782a;

    public AbstractC0835M(HttpExtractor httpExtractor) {
        Preconditions.checkNotNull(httpExtractor, "extractor");
        this.f3782a = httpExtractor;
    }

    /* renamed from: d */
    public static void m67460d(Span span, String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            span.putAttribute(str, AttributeValue.stringAttributeValue(str2));
        }
    }

    /* renamed from: e */
    public static void m67459e(Span span, long j, MessageEvent.Type type, long j2, long j3) {
        span.addMessageEvent(MessageEvent.builder(type, j).setUncompressedMessageSize(j2).setCompressedMessageSize(j3).build());
    }

    /* renamed from: a */
    public final void m67463a(Span span, Object obj, HttpExtractor httpExtractor) {
        m67460d(span, HttpTraceAttributeConstants.HTTP_USER_AGENT, httpExtractor.getUserAgent(obj));
        m67460d(span, HttpTraceAttributeConstants.HTTP_HOST, httpExtractor.getHost(obj));
        m67460d(span, HttpTraceAttributeConstants.HTTP_METHOD, httpExtractor.getMethod(obj));
        m67460d(span, HttpTraceAttributeConstants.HTTP_PATH, httpExtractor.getPath(obj));
        m67460d(span, "http.route", httpExtractor.getRoute(obj));
        m67460d(span, HttpTraceAttributeConstants.HTTP_URL, httpExtractor.getUrl(obj));
    }

    /* renamed from: b */
    public HttpRequestContext m67462b(Span span, TagContext tagContext) {
        return new HttpRequestContext(span, tagContext);
    }

    /* renamed from: c */
    public final String m67461c(Object obj, HttpExtractor httpExtractor) {
        String path = httpExtractor.getPath(obj);
        if (path == null) {
            path = RemoteSettings.FORWARD_SLASH_STRING;
        }
        if (!path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return RemoteSettings.FORWARD_SLASH_STRING + path;
        }
        return path;
    }

    /* renamed from: f */
    public void m67458f(Span span, int i, Throwable th2) {
        if (span.getOptions().contains(Span.Options.RECORD_EVENTS)) {
            span.putAttribute(HttpTraceAttributeConstants.HTTP_STATUS_CODE, AttributeValue.longAttributeValue(i));
            span.setStatus(HttpTraceUtil.parseResponseStatus(i, th2));
        }
        span.end();
    }

    public Span getSpanFromContext(HttpRequestContext httpRequestContext) {
        Preconditions.checkNotNull(httpRequestContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        return httpRequestContext.f63544b;
    }

    public final void handleMessageReceived(HttpRequestContext httpRequestContext, long j) {
        Preconditions.checkNotNull(httpRequestContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        httpRequestContext.f63546d.addAndGet(j);
        if (httpRequestContext.f63544b.getOptions().contains(Span.Options.RECORD_EVENTS)) {
            m67459e(httpRequestContext.f63544b, httpRequestContext.f63548f.addAndGet(1L), MessageEvent.Type.RECEIVED, j, 0L);
        }
    }

    public final void handleMessageSent(HttpRequestContext httpRequestContext, long j) {
        Preconditions.checkNotNull(httpRequestContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        httpRequestContext.f63545c.addAndGet(j);
        if (httpRequestContext.f63544b.getOptions().contains(Span.Options.RECORD_EVENTS)) {
            m67459e(httpRequestContext.f63544b, httpRequestContext.f63547e.addAndGet(1L), MessageEvent.Type.SENT, j, 0L);
        }
    }
}