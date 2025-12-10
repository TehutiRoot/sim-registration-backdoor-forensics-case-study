package ch.qos.logback.core;

import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UnsynchronizedAppenderBase<E> extends ContextAwareBase implements Appender<E> {
    protected String name;
    protected boolean started = false;

    /* renamed from: c */
    public ThreadLocal f39730c = new ThreadLocal();

    /* renamed from: d */
    public FilterAttachableImpl f39731d = new FilterAttachableImpl();

    /* renamed from: e */
    public int f39732e = 0;

    /* renamed from: f */
    public int f39733f = 0;

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void addFilter(Filter<E> filter) {
        this.f39731d.addFilter(filter);
    }

    public abstract void append(E e);

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void clearAllFilters() {
        this.f39731d.clearAllFilters();
    }

    @Override // ch.qos.logback.core.Appender
    public void doAppend(E e) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f39730c.get())) {
            return;
        }
        try {
            try {
                this.f39730c.set(bool);
            } catch (Exception e2) {
                int i = this.f39733f;
                this.f39733f = i + 1;
                if (i < 3) {
                    addError("Appender [" + this.name + "] failed to append.", e2);
                }
            }
            if (!this.started) {
                int i2 = this.f39732e;
                this.f39732e = i2 + 1;
                if (i2 < 3) {
                    addStatus(new WarnStatus("Attempted to append to non started appender [" + this.name + "].", this));
                }
            } else if (getFilterChainDecision(e) != FilterReply.DENY) {
                append(e);
            }
        } finally {
            this.f39730c.set(Boolean.FALSE);
        }
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public List<Filter<E>> getCopyOfAttachedFiltersList() {
        return this.f39731d.getCopyOfAttachedFiltersList();
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public FilterReply getFilterChainDecision(E e) {
        return this.f39731d.getFilterChainDecision(e);
    }

    @Override // ch.qos.logback.core.Appender
    public String getName() {
        return this.name;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.Appender
    public void setName(String str) {
        this.name = str;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public String toString() {
        return getClass().getName() + "[" + this.name + "]";
    }
}
