package ch.qos.logback.core.rolling;

import ch.qos.logback.core.spi.ContextAwareBase;

/* loaded from: classes.dex */
public abstract class TriggeringPolicyBase<E> extends ContextAwareBase implements TriggeringPolicy<E> {

    /* renamed from: c */
    public boolean f40063c;

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f40063c;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40063c = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f40063c = false;
    }
}
