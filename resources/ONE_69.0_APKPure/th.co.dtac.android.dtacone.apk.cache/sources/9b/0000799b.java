package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.LoggingEventPreSerializationTransformer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.server.SSLServerSocketAppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;

/* loaded from: classes.dex */
public class SSLServerSocketAppender extends SSLServerSocketAppenderBase<ILoggingEvent> {

    /* renamed from: o */
    public static final PreSerializationTransformer f39596o = new LoggingEventPreSerializationTransformer();

    /* renamed from: n */
    public boolean f39597n;

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return f39596o;
    }

    public boolean isIncludeCallerData() {
        return this.f39597n;
    }

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender
    public void postProcessEvent(ILoggingEvent iLoggingEvent) {
        if (isIncludeCallerData()) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.f39597n = z;
    }
}