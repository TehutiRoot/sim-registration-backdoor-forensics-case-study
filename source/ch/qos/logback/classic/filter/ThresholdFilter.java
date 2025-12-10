package ch.qos.logback.classic.filter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/* loaded from: classes.dex */
public class ThresholdFilter extends Filter<ILoggingEvent> {

    /* renamed from: e */
    public Level f39539e;

    @Override // ch.qos.logback.core.filter.Filter
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (isStarted() && !iLoggingEvent.getLevel().isGreaterOrEqual(this.f39539e)) {
            return FilterReply.DENY;
        }
        return FilterReply.NEUTRAL;
    }

    public void setLevel(String str) {
        this.f39539e = Level.toLevel(str);
    }

    @Override // ch.qos.logback.core.filter.Filter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.f39539e != null) {
            super.start();
        }
    }
}
