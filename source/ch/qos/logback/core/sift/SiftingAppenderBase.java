package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.ComponentTracker;
import ch.qos.logback.core.util.Duration;

/* loaded from: classes.dex */
public abstract class SiftingAppenderBase<E> extends AppenderBase<E> {
    protected AppenderTracker<E> appenderTracker;

    /* renamed from: g */
    public AppenderFactory f40098g;

    /* renamed from: h */
    public Duration f40099h = new Duration(ComponentTracker.DEFAULT_TIMEOUT);

    /* renamed from: i */
    public int f40100i = Integer.MAX_VALUE;

    /* renamed from: j */
    public Discriminator f40101j;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (isStarted()) {
            String discriminatingValue = this.f40101j.getDiscriminatingValue(e);
            long timestamp = getTimestamp(e);
            Appender<E> orCreate = this.appenderTracker.getOrCreate(discriminatingValue, timestamp);
            if (eventMarksEndOfLife(e)) {
                this.appenderTracker.endOfLife(discriminatingValue);
            }
            this.appenderTracker.removeStaleComponents(timestamp);
            orCreate.doAppend(e);
        }
    }

    public abstract boolean eventMarksEndOfLife(E e);

    public AppenderTracker<E> getAppenderTracker() {
        return this.appenderTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.f40101j;
    }

    public String getDiscriminatorKey() {
        Discriminator discriminator = this.f40101j;
        if (discriminator != null) {
            return discriminator.getKey();
        }
        return null;
    }

    public int getMaxAppenderCount() {
        return this.f40100i;
    }

    public Duration getTimeout() {
        return this.f40099h;
    }

    public abstract long getTimestamp(E e);

    public void setAppenderFactory(AppenderFactory<E> appenderFactory) {
        this.f40098g = appenderFactory;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.f40101j = discriminator;
    }

    public void setMaxAppenderCount(int i) {
        this.f40100i = i;
    }

    public void setTimeout(Duration duration) {
        this.f40099h = duration;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (this.f40101j == null) {
            addError("Missing discriminator. Aborting");
            i = 1;
        } else {
            i = 0;
        }
        if (!this.f40101j.isStarted()) {
            addError("Discriminator has not started successfully. Aborting");
            i++;
        }
        AppenderFactory appenderFactory = this.f40098g;
        if (appenderFactory == null) {
            addError("AppenderFactory has not been set. Aborting");
            i++;
        } else {
            AppenderTracker<E> appenderTracker = new AppenderTracker<>(this.context, appenderFactory);
            this.appenderTracker = appenderTracker;
            appenderTracker.setMaxComponents(this.f40100i);
            this.appenderTracker.setTimeout(this.f40099h.getMilliseconds());
        }
        if (i == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        for (Appender<E> appender : this.appenderTracker.allComponents()) {
            appender.stop();
        }
    }
}
