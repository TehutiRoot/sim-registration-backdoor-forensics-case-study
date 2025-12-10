package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSSLSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

/* loaded from: classes.dex */
public class SSLSocketAppender extends AbstractSSLSocketAppender<ILoggingEvent> {

    /* renamed from: w */
    public final PreSerializationTransformer f39564w = new LoggingEventPreSerializationTransformer();

    /* renamed from: x */
    public boolean f39565x;

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return this.f39564w;
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public void postProcessEvent(ILoggingEvent iLoggingEvent) {
        if (this.f39565x) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.f39565x = z;
    }
}