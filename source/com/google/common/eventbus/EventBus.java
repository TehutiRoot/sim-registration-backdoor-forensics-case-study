package com.google.common.eventbus;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class EventBus {

    /* renamed from: f */
    public static final Logger f53754f = Logger.getLogger(EventBus.class.getName());

    /* renamed from: a */
    public final String f53755a;

    /* renamed from: b */
    public final Executor f53756b;

    /* renamed from: c */
    public final SubscriberExceptionHandler f53757c;

    /* renamed from: d */
    public final MO1 f53758d;

    /* renamed from: e */
    public final AbstractC11638kJ f53759e;

    /* renamed from: com.google.common.eventbus.EventBus$a */
    /* loaded from: classes4.dex */
    public static final class C7996a implements SubscriberExceptionHandler {

        /* renamed from: a */
        public static final C7996a f53760a = new C7996a();

        /* renamed from: a */
        public static Logger m40169a(SubscriberExceptionContext subscriberExceptionContext) {
            return Logger.getLogger(EventBus.class.getName() + "." + subscriberExceptionContext.getEventBus().identifier());
        }

        /* renamed from: b */
        public static String m40168b(SubscriberExceptionContext subscriberExceptionContext) {
            Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + CoreConstants.LEFT_PARENTHESIS_CHAR + subscriberMethod.getParameterTypes()[0].getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR + " on subscriber " + subscriberExceptionContext.getSubscriber() + " when dispatching event: " + subscriberExceptionContext.getEvent();
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th2, SubscriberExceptionContext subscriberExceptionContext) {
            Logger m40169a = m40169a(subscriberExceptionContext);
            Level level = Level.SEVERE;
            if (m40169a.isLoggable(level)) {
                m40169a.log(level, m40168b(subscriberExceptionContext), th2);
            }
        }
    }

    public EventBus() {
        this("default");
    }

    /* renamed from: a */
    public final Executor m40171a() {
        return this.f53756b;
    }

    /* renamed from: b */
    public void m40170b(Throwable th2, SubscriberExceptionContext subscriberExceptionContext) {
        Preconditions.checkNotNull(th2);
        Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.f53757c.handleException(th2, subscriberExceptionContext);
        } catch (Throwable th3) {
            f53754f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th3, th2), th3);
        }
    }

    public final String identifier() {
        return this.f53755a;
    }

    public void post(Object obj) {
        Iterator m67388f = this.f53758d.m67388f(obj);
        if (m67388f.hasNext()) {
            this.f53759e.mo28961a(obj, m67388f);
        } else if (!(obj instanceof DeadEvent)) {
            post(new DeadEvent(this, obj));
        }
    }

    public void register(Object obj) {
        this.f53758d.m67387g(obj);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.f53755a).toString();
    }

    public void unregister(Object obj) {
        this.f53758d.m67386h(obj);
    }

    public EventBus(String str) {
        this(str, MoreExecutors.directExecutor(), AbstractC11638kJ.m28964c(), C7996a.f53760a);
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
        this("default", MoreExecutors.directExecutor(), AbstractC11638kJ.m28964c(), subscriberExceptionHandler);
    }

    public EventBus(String str, Executor executor, AbstractC11638kJ abstractC11638kJ, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.f53758d = new MO1(this);
        this.f53755a = (String) Preconditions.checkNotNull(str);
        this.f53756b = (Executor) Preconditions.checkNotNull(executor);
        this.f53759e = (AbstractC11638kJ) Preconditions.checkNotNull(abstractC11638kJ);
        this.f53757c = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }
}
