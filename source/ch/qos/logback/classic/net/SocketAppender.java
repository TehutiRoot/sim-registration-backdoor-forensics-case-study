package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

/* loaded from: classes.dex */
public class SocketAppender extends AbstractSocketAppender<ILoggingEvent> {

    /* renamed from: v */
    public static final PreSerializationTransformer f39578v = new LoggingEventPreSerializationTransformer();

    /* renamed from: u */
    public boolean f39579u = false;

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return f39578v;
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public void postProcessEvent(ILoggingEvent iLoggingEvent) {
        if (this.f39579u) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.f39579u = z;
    }
}
