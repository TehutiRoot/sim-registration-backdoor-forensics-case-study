package io.opencensus.trace;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import io.opencensus.internal.Utils;
import io.opencensus.trace.internal.BaseMessageEventUtils;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class Span {

    /* renamed from: c */
    public static final Map f63671c = Collections.emptyMap();

    /* renamed from: d */
    public static final Set f63672d = Collections.unmodifiableSet(EnumSet.noneOf(Options.class));

    /* renamed from: a */
    public final SpanContext f63673a;

    /* renamed from: b */
    public final Set f63674b;

    /* loaded from: classes5.dex */
    public enum Kind {
        SERVER,
        CLIENT
    }

    /* loaded from: classes5.dex */
    public enum Options {
        RECORD_EVENTS
    }

    public Span(SpanContext spanContext, @Nullable EnumSet<Options> enumSet) {
        Set unmodifiableSet;
        boolean z;
        this.f63673a = (SpanContext) Utils.checkNotNull(spanContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (enumSet == null) {
            unmodifiableSet = f63672d;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(EnumSet.copyOf((EnumSet) enumSet));
        }
        this.f63674b = unmodifiableSet;
        if (spanContext.getTraceOptions().isSampled() && !unmodifiableSet.contains(Options.RECORD_EVENTS)) {
            z = false;
        } else {
            z = true;
        }
        Utils.checkArgument(z, "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public abstract void addAnnotation(Annotation annotation);

    public final void addAnnotation(String str) {
        Utils.checkNotNull(str, "description");
        addAnnotation(str, f63671c);
    }

    public abstract void addAnnotation(String str, Map<String, AttributeValue> map);

    @Deprecated
    public void addAttributes(Map<String, AttributeValue> map) {
        putAttributes(map);
    }

    public abstract void addLink(Link link);

    public void addMessageEvent(MessageEvent messageEvent) {
        Utils.checkNotNull(messageEvent, "messageEvent");
        addNetworkEvent(BaseMessageEventUtils.asNetworkEvent(messageEvent));
    }

    @Deprecated
    public void addNetworkEvent(NetworkEvent networkEvent) {
        addMessageEvent(BaseMessageEventUtils.asMessageEvent(networkEvent));
    }

    public final void end() {
        end(EndSpanOptions.DEFAULT);
    }

    public abstract void end(EndSpanOptions endSpanOptions);

    public final SpanContext getContext() {
        return this.f63673a;
    }

    public final Set<Options> getOptions() {
        return this.f63674b;
    }

    public void putAttribute(String str, AttributeValue attributeValue) {
        Utils.checkNotNull(str, Action.KEY_ATTRIBUTE);
        Utils.checkNotNull(attributeValue, "value");
        putAttributes(Collections.singletonMap(str, attributeValue));
    }

    public void putAttributes(Map<String, AttributeValue> map) {
        Utils.checkNotNull(map, "attributes");
        addAttributes(map);
    }

    public void setStatus(Status status) {
        Utils.checkNotNull(status, NotificationCompat.CATEGORY_STATUS);
    }
}
