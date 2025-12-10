package ch.qos.logback.core;

import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AppenderBase<E> extends ContextAwareBase implements Appender<E> {
    protected String name;
    protected volatile boolean started = false;

    /* renamed from: c */
    public boolean f39695c = false;

    /* renamed from: d */
    public FilterAttachableImpl f39696d = new FilterAttachableImpl();

    /* renamed from: e */
    public int f39697e = 0;

    /* renamed from: f */
    public int f39698f = 0;

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void addFilter(Filter<E> filter) {
        this.f39696d.addFilter(filter);
    }

    public abstract void append(E e);

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void clearAllFilters() {
        this.f39696d.clearAllFilters();
    }

    @Override // ch.qos.logback.core.Appender
    public synchronized void doAppend(E e) {
        if (this.f39695c) {
            return;
        }
        try {
            this.f39695c = true;
        } catch (Exception e2) {
            int i = this.f39698f;
            this.f39698f = i + 1;
            if (i < 5) {
                addError("Appender [" + this.name + "] failed to append.", e2);
            }
        }
        if (this.started) {
            if (getFilterChainDecision(e) == FilterReply.DENY) {
                this.f39695c = false;
                return;
            }
            append(e);
            this.f39695c = false;
            return;
        }
        int i2 = this.f39697e;
        this.f39697e = i2 + 1;
        if (i2 < 5) {
            addStatus(new WarnStatus("Attempted to append to non started appender [" + this.name + "].", this));
        }
        this.f39695c = false;
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public List<Filter<E>> getCopyOfAttachedFiltersList() {
        return this.f39696d.getCopyOfAttachedFiltersList();
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public FilterReply getFilterChainDecision(E e) {
        return this.f39696d.getFilterChainDecision(e);
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

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }

    public String toString() {
        return getClass().getName() + "[" + this.name + "]";
    }
}
