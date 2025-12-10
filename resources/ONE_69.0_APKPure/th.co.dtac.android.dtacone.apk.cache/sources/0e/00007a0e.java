package ch.qos.logback.core.hook;

import ch.qos.logback.core.util.Duration;

/* loaded from: classes.dex */
public class DefaultShutdownHook extends ShutdownHookBase {
    public static final Duration DEFAULT_DELAY = Duration.buildByMilliseconds(0.0d);

    /* renamed from: c */
    public Duration f39754c = DEFAULT_DELAY;

    public Duration getDelay() {
        return this.f39754c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f39754c.getMilliseconds() > 0) {
            addInfo("Sleeping for " + this.f39754c);
            try {
                Thread.sleep(this.f39754c.getMilliseconds());
            } catch (InterruptedException unused) {
            }
        }
        super.stop();
    }

    public void setDelay(Duration duration) {
        this.f39754c = duration;
    }
}