package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class SubscriberExceptionContext {

    /* renamed from: a */
    public final EventBus f53773a;

    /* renamed from: b */
    public final Object f53774b;

    /* renamed from: c */
    public final Object f53775c;

    /* renamed from: d */
    public final Method f53776d;

    public SubscriberExceptionContext(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.f53773a = (EventBus) Preconditions.checkNotNull(eventBus);
        this.f53774b = Preconditions.checkNotNull(obj);
        this.f53775c = Preconditions.checkNotNull(obj2);
        this.f53776d = (Method) Preconditions.checkNotNull(method);
    }

    public Object getEvent() {
        return this.f53774b;
    }

    public EventBus getEventBus() {
        return this.f53773a;
    }

    public Object getSubscriber() {
        return this.f53775c;
    }

    public Method getSubscriberMethod() {
        return this.f53776d;
    }
}