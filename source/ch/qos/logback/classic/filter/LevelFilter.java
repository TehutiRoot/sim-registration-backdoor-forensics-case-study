package ch.qos.logback.classic.filter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.AbstractMatcherFilter;
import ch.qos.logback.core.spi.FilterReply;

/* loaded from: classes.dex */
public class LevelFilter extends AbstractMatcherFilter<ILoggingEvent> {

    /* renamed from: e */
    public Level f39538e;

    @Override // ch.qos.logback.core.filter.Filter
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        return !isStarted() ? FilterReply.NEUTRAL : iLoggingEvent.getLevel().equals(this.f39538e) ? this.onMatch : this.onMismatch;
    }

    public void setLevel(Level level) {
        this.f39538e = level;
    }

    @Override // ch.qos.logback.core.filter.Filter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.f39538e != null) {
            super.start();
        }
    }
}
