package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSSLSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

/* loaded from: classes.dex */
public class SSLSocketAppender extends AbstractSSLSocketAppender<ILoggingEvent> {

    /* renamed from: w */
    public final PreSerializationTransformer f39566w = new LoggingEventPreSerializationTransformer();

    /* renamed from: x */
    public boolean f39567x;

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return this.f39566w;
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public void postProcessEvent(ILoggingEvent iLoggingEvent) {
        if (this.f39567x) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.f39567x = z;
    }
}
