package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public abstract class TurboFilter extends ContextAwareBase implements LifeCycle {

    /* renamed from: c */
    public String f39686c;

    /* renamed from: d */
    public boolean f39687d = false;

    public abstract FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th2);

    public String getName() {
        return this.f39686c;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f39687d;
    }

    public void setName(String str) {
        this.f39686c = str;
    }

    public void start() {
        this.f39687d = true;
    }

    public void stop() {
        this.f39687d = false;
    }
}
