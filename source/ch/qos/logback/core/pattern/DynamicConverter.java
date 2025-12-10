package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.Status;
import java.util.List;

/* loaded from: classes.dex */
public abstract class DynamicConverter<E> extends FormattingConverter<E> implements LifeCycle, ContextAware {

    /* renamed from: d */
    public List f39970d;

    /* renamed from: c */
    public ContextAwareBase f39969c = new ContextAwareBase(this);
    protected boolean started = false;

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        this.f39969c.addError(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        this.f39969c.addInfo(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        this.f39969c.addStatus(status);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        this.f39969c.addWarn(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.f39969c.getContext();
    }

    public String getFirstOption() {
        List list = this.f39970d;
        if (list == null || list.size() == 0) {
            return null;
        }
        return (String) this.f39970d.get(0);
    }

    public List<String> getOptionList() {
        return this.f39970d;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        this.f39969c.setContext(context);
    }

    public void setOptionList(List<String> list) {
        this.f39970d = list;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th2) {
        this.f39969c.addError(str, th2);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th2) {
        this.f39969c.addInfo(str, th2);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th2) {
        this.f39969c.addWarn(str, th2);
    }
}
