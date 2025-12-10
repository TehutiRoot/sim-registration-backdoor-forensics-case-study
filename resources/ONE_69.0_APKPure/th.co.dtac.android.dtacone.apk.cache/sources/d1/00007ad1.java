package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.helpers.NOPAppender;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ContextAwareImpl;

/* loaded from: classes.dex */
public class AppenderTracker<E> extends AbstractComponentTracker<Appender<E>> {

    /* renamed from: g */
    public int f40092g = 0;

    /* renamed from: h */
    public final Context f40093h;

    /* renamed from: i */
    public final AppenderFactory f40094i;

    /* renamed from: j */
    public final ContextAwareImpl f40095j;

    public AppenderTracker(Context context, AppenderFactory<E> appenderFactory) {
        this.f40093h = context;
        this.f40094i = appenderFactory;
        this.f40095j = new ContextAwareImpl(context, this);
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public Appender<E> buildComponent(String str) {
        Appender<E> appender;
        try {
            appender = this.f40094i.buildAppender(this.f40093h, str);
        } catch (JoranException unused) {
            ContextAwareImpl contextAwareImpl = this.f40095j;
            contextAwareImpl.addError("Error while building appender with discriminating value [" + str + "]");
            appender = null;
        }
        return appender == null ? m51367k(str) : appender;
    }

    public boolean isComponentStale(Appender<E> appender) {
        return !appender.isStarted();
    }

    /* renamed from: k */
    public final NOPAppender m51367k(String str) {
        int i = this.f40092g;
        if (i < 4) {
            this.f40092g = i + 1;
            ContextAwareImpl contextAwareImpl = this.f40095j;
            contextAwareImpl.addError("Building NOPAppender for discriminating value [" + str + "]");
        }
        NOPAppender nOPAppender = new NOPAppender();
        nOPAppender.setContext(this.f40093h);
        nOPAppender.start();
        return nOPAppender;
    }

    public void processPriorToRemoval(Appender<E> appender) {
        appender.stop();
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public /* bridge */ /* synthetic */ boolean isComponentStale(Object obj) {
        return isComponentStale((Appender) ((Appender) obj));
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public /* bridge */ /* synthetic */ void processPriorToRemoval(Object obj) {
        processPriorToRemoval((Appender) ((Appender) obj));
    }
}