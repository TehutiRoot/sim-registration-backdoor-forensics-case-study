package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.LoggingEventPreSerializationTransformer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.server.AbstractServerSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

/* loaded from: classes.dex */
public class ServerSocketAppender extends AbstractServerSocketAppender<ILoggingEvent> {

    /* renamed from: m */
    public static final PreSerializationTransformer f39602m = new LoggingEventPreSerializationTransformer();

    /* renamed from: l */
    public boolean f39603l;

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return f39602m;
    }

    public boolean isIncludeCallerData() {
        return this.f39603l;
    }

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender
    public void postProcessEvent(ILoggingEvent iLoggingEvent) {
        if (isIncludeCallerData()) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.f39603l = z;
    }
}
