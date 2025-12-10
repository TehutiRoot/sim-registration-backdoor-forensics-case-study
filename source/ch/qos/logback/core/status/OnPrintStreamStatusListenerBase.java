package ch.qos.logback.core.status;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.StatusPrinter;
import java.io.PrintStream;

/* loaded from: classes.dex */
public abstract class OnPrintStreamStatusListenerBase extends ContextAwareBase implements StatusListener, LifeCycle {

    /* renamed from: c */
    public boolean f40123c = false;

    /* renamed from: d */
    public long f40124d = 300;

    /* renamed from: e */
    public String f40125e;

    @Override // ch.qos.logback.core.status.StatusListener
    public void addStatusEvent(Status status) {
        if (this.f40123c) {
            m51358d(status);
        }
    }

    /* renamed from: b */
    public final boolean m51359b(long j, long j2) {
        return j - j2 < this.f40124d;
    }

    /* renamed from: d */
    public final void m51358d(Status status) {
        StringBuilder sb = new StringBuilder();
        String str = this.f40125e;
        if (str != null) {
            sb.append(str);
        }
        StatusPrinter.buildStr(sb, "", status);
        getPrintStream().print(sb);
    }

    /* renamed from: g */
    public final void m51357g() {
        if (this.context == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (Status status : this.context.getStatusManager().getCopyOfStatusList()) {
            if (m51359b(currentTimeMillis, status.getDate().longValue())) {
                m51358d(status);
            }
        }
    }

    public String getPrefix() {
        return this.f40125e;
    }

    public abstract PrintStream getPrintStream();

    public long getRetrospective() {
        return this.f40124d;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f40123c;
    }

    public void setPrefix(String str) {
        this.f40125e = str;
    }

    public void setRetrospective(long j) {
        this.f40124d = j;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40123c = true;
        if (this.f40124d > 0) {
            m51357g();
        }
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f40123c = false;
    }
}
