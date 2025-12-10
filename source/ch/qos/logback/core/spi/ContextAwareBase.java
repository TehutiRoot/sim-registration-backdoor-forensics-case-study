package ch.qos.logback.core.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class ContextAwareBase implements ContextAware {

    /* renamed from: a */
    public int f40117a;

    /* renamed from: b */
    public final Object f40118b;
    protected Context context;

    public ContextAwareBase() {
        this.f40117a = 0;
        this.f40118b = this;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        addStatus(new ErrorStatus(str, getDeclaredOrigin()));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        addStatus(new InfoStatus(str, getDeclaredOrigin()));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i = this.f40117a;
        this.f40117a = i + 1;
        if (i == 0) {
            PrintStream printStream = System.out;
            printStream.println("LOGBACK: No context given for " + this);
        }
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        addStatus(new WarnStatus(str, getDeclaredOrigin()));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.context;
    }

    public Object getDeclaredOrigin() {
        return this.f40118b;
    }

    public StatusManager getStatusManager() {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        return context.getStatusManager();
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        Context context2 = this.context;
        if (context2 == null) {
            this.context = context;
        } else if (context2 != context) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    public ContextAwareBase(ContextAware contextAware) {
        this.f40117a = 0;
        this.f40118b = contextAware;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th2) {
        addStatus(new ErrorStatus(str, getDeclaredOrigin(), th2));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th2) {
        addStatus(new InfoStatus(str, getDeclaredOrigin(), th2));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th2) {
        addStatus(new WarnStatus(str, getDeclaredOrigin(), th2));
    }
}
