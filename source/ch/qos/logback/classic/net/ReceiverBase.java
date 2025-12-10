package ch.qos.logback.classic.net;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

/* loaded from: classes.dex */
public abstract class ReceiverBase extends ContextAwareBase implements LifeCycle {

    /* renamed from: c */
    public boolean f39564c;

    public abstract Runnable getRunnableTask();

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final boolean isStarted() {
        return this.f39564c;
    }

    public abstract void onStop();

    public abstract boolean shouldStart();

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final void start() {
        if (isStarted()) {
            return;
        }
        if (getContext() == null) {
            throw new IllegalStateException("context not set");
        }
        if (shouldStart()) {
            getContext().getScheduledExecutorService().execute(getRunnableTask());
            this.f39564c = true;
        }
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final void stop() {
        if (isStarted()) {
            try {
                onStop();
            } catch (RuntimeException e) {
                addError("on stop: " + e, e);
            }
            this.f39564c = false;
        }
    }
}
