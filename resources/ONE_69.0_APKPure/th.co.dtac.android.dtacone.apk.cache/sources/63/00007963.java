package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AsyncAppenderBase;

/* loaded from: classes.dex */
public class AsyncAppender extends AsyncAppenderBase<ILoggingEvent> {

    /* renamed from: o */
    public boolean f39503o = false;

    @Override // ch.qos.logback.core.AsyncAppenderBase
    public boolean isDiscardable(ILoggingEvent iLoggingEvent) {
        return iLoggingEvent.getLevel().toInt() <= 20000;
    }

    public boolean isIncludeCallerData() {
        return this.f39503o;
    }

    @Override // ch.qos.logback.core.AsyncAppenderBase
    public void preprocess(ILoggingEvent iLoggingEvent) {
        iLoggingEvent.prepareForDeferredProcessing();
        if (this.f39503o) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.f39503o = z;
    }
}