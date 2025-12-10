package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAwareBase;

/* loaded from: classes.dex */
public abstract class EventEvaluatorBase<E> extends ContextAwareBase implements EventEvaluator<E> {

    /* renamed from: c */
    public String f39739c;

    /* renamed from: d */
    public boolean f39740d;

    @Override // ch.qos.logback.core.boolex.EventEvaluator
    public String getName() {
        return this.f39739c;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f39740d;
    }

    @Override // ch.qos.logback.core.boolex.EventEvaluator
    public void setName(String str) {
        if (this.f39739c != null) {
            throw new IllegalStateException("name has been already set");
        }
        this.f39739c = str;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f39740d = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f39740d = false;
    }
}
