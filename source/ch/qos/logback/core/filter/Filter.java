package ch.qos.logback.core.filter;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;

/* loaded from: classes.dex */
public abstract class Filter<E> extends ContextAwareBase implements LifeCycle {

    /* renamed from: c */
    public String f39747c;

    /* renamed from: d */
    public boolean f39748d = false;

    public abstract FilterReply decide(E e);

    public String getName() {
        return this.f39747c;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f39748d;
    }

    public void setName(String str) {
        this.f39747c = str;
    }

    public void start() {
        this.f39748d = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f39748d = false;
    }
}
